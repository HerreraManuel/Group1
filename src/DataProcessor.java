import GitParser.*;
import RepositoryAnalyzer.Analyzer;
import RepositoryAnalyzer.Result;

import java.io.*;
import java.util.*;

class DataProcessor implements Retrievable
{
    static private ArrayList<Result> results;

    enum metric_mode{ WORDS, CHARACTERS, LINES, SOURCES, COMMENTS }

    public DataProcessor(String inputURl, String[] searchCriteria) throws IOException
    {
        try
        {
            GitParser parser = new GitParser();
            File file = parser.getGitRepo(inputURl);
            Repository repository = new Repository(file);
            Queue<File> queue = new LinkedList<>();
            queue = repository.getAllFiles();
            results = new ArrayList<Result>();
            processSearchCriteria(queue, searchCriteria);
            debugDisplay();

            /*
            if(deleteRepository(file) == true)
            {
                repository = null;
            }
            else
            {
                System.out.println("Unable to delete " + file.getName());
            }
            */

        }
        catch (Exception e)
        {
            System.out.println("Caught exception int datmodel : " );
            e.printStackTrace();
            throw new IOException();
        }
    }

    //TODO: Should we use the FileExtensions class in the Helper package for consistency?
    public boolean isSuffix(String suffix) {
        if (suffix.toLowerCase().equals(".java") || suffix.toLowerCase().equals(".c") ||
                suffix.toLowerCase().equals(".h") || suffix.toLowerCase().equals(".cpp") ||
                suffix.toLowerCase().equals(".hpp") || suffix.toLowerCase().equals(".txt"))
        {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isURL(String link)
    {
        String extension = link.substring(link.lastIndexOf("."));
        String websiteAddress = "https://github.com/";

        if(link.contains("https://github.com/") && extension.equals(".git"))
        {
            System.out.println("Valid Git URL");
            return true;
        }
        else
            return false;
    }

    @Override
    public int[] getCharacterCount() {
        int[] characterCounts = getFromResults(metric_mode.CHARACTERS);
        return characterCounts;
    }

    @Override
    public int[] getWordCount() {
        int[] wordCounts = getFromResults(metric_mode.WORDS);
        return wordCounts;
    }

    @Override
    public int[] getLineCount() {
        int[] lineCounts = getFromResults(metric_mode.LINES);
        return lineCounts;
    }

    @Override
    public int[] getSourceCount() {
        int[] wordCounts = getFromResults(metric_mode.SOURCES);
        return wordCounts;
    }

    @Override
    public int[] getCommentCount() {
        int[] commentCounts = getFromResults(metric_mode.COMMENTS);
        return commentCounts;
    }

    public int getNumFiles(){
        return results.size();
    }

    @Override
    public String[] getFileNames() {
        String[] fileNames = new String[results.size()];
        for(int i = 0; i < fileNames.length; i++)
        {
            fileNames[i] = results.get(i).getFileName();
        }
        return fileNames;
    }

    public int[] getFromResults(metric_mode requestedMetric)
    {
        int[] metrics = new int[results.size()];

        for(int i = 0; i < metrics.length; i++)
        {
            if(requestedMetric == metric_mode.WORDS) {
                metrics[i] = results.get(i).getWordCount();
            }
            else if(requestedMetric == metric_mode.CHARACTERS) {
                metrics[i] = results.get(i).getCharacterCount();
            }
            else if(requestedMetric == metric_mode.LINES) {
                metrics[i] = results.get(i).getLineCount();
            }
            else if(requestedMetric == metric_mode.SOURCES) {
                metrics[i] = results.get(i).getSourceCount();
            }
            else if(requestedMetric == metric_mode.COMMENTS) {
                metrics[i] = results.get(i).getCommentCount();
            }
            else {
                metrics[i] = -1;
            }
        }
        return metrics;
    }

    public String [] [] getCompleteFile()
    {
        String [][] completeFile = new String [6][getNumFiles()];
        String [] fileNames = getFileNames();

        int longestFileNameSize = 0;
        for(int i = 0; i < getNumFiles(); i++)
        {
            if(fileNames[i].length() > longestFileNameSize)
                longestFileNameSize = fileNames[i].length();
        }

        int[] characters = getCharacterCount();
        int[] words = getWordCount();
        int[] lines = getLineCount();
        int[] sourceLines = getSourceCount();
        int[] commentLines = getCommentCount();
        for (int i = 0; i < getNumFiles();i++){
            completeFile[0][i] = fileNames[i];
            completeFile[1][i] = String.valueOf(characters[i]);
            completeFile[2][i] = String.valueOf(words[i]);
            completeFile[3][i] = String.valueOf(lines[i]);
            if(sourceLines[i] >= 0 ) {
                completeFile[4][i] = String.valueOf(sourceLines[i]);
            }else{
                completeFile[4][i] = "N/A";
            }
            if(commentLines[i] >= 0) {
                completeFile[5][i] = String.valueOf(commentLines[i]);
            }else{
                completeFile[5][i] = "N/A";
            }
        }
        return completeFile;
    }

    //TODO: search criteria should be valid when coming in to back end, duplicate extensions lead to invalid duplicate results
    //TODO: search criteria needs to be fixed; will not handle string such as .c,.cpp - will count .c only in this case
    //TODO: relating to issue above, search criteria can handle strings such as .c .cpp - searchCriteria length depends on extensions separated by spaces only - this needs to be revised
    //TODO: search criteria with no criteria does not print anything due to search criteria not being set to null. A fix for backend is possible and easy if only search criteria is revised to reflect case
    /* Processes search criteria and adds results of files pertaining to criteria */
    private void processSearchCriteria(Queue<File> queue, String[] searchCriteria)
    {
        System.out.println("searchCriteria size " + searchCriteria.length);
        while (!queue.isEmpty()) {
            Analyzer analyzer = new Analyzer(queue.element());
            String fileName = analyzer.getFileName();
            if (fileName.contains(".")) {
                String fileExtension = fileName.substring(fileName.lastIndexOf("."));
                for (int i = 0; i < searchCriteria.length; i++) {
                    if (isSuffix(fileExtension) && fileExtension.equalsIgnoreCase(searchCriteria[i]))
                    {
                      results.add(analyzer.getResult());
                    }
                }
            }
            queue.remove();
        }
    }

    /* Deletes a directory with subdirectories */
    public static boolean deleteRepository(File dir)
    {
        if (dir.isDirectory())
        {
            File[] children = dir.listFiles();
            for (int i = 0; i < children.length; i++)
            {
                boolean success = deleteRepository(children[i]);
                if (!success)
                {
                    return false;
                }
            }
        }
        // either file or an empty directory
        return dir.delete();
    }

    /* Displays list of results for debugging */
    public void debugDisplay()
    {
        for(int i = 0; i < results.size(); i++)
        {
            System.out.println(results.get(i));
        }
    }
}