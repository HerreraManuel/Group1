import GitParser.*;
import Metrics.*;
import RepositoryAnalyzer.Analyzer;
import RepositoryAnalyzer.Result;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.*;
import java.util.*;

class DataModel implements Retrievable
{
    private ArrayList<Result> results;

    enum metric_mode{ WORDS, CHARACTERS, LINES, SOURCES, COMMENTS }

    public DataModel(String inputURl, String[] searchCriteria) throws IOException
    {
        try
        {
            GitParser parser = new GitParser();
            File repository = parser.getGitRepo(inputURl);
            Repository r = new Repository(repository);
            Queue<File> queue = new LinkedList<>();
            queue = r.getAllFiles();
            results = new ArrayList<Result>();

            while(!queue.isEmpty())
            {
                Analyzer analyzer = new Analyzer(queue.remove());
                results.add(analyzer.getResult());
            }
        }
        catch (Exception e)
        {
            System.out.println("Caught exception int datmodel : " + e.getMessage());
            throw new IOException();
        }
    }

    public boolean isSuffix(String suffix) {
        if (suffix.contains(".java") || suffix.contains(".c") || suffix.contains(".h") || suffix.contains(".cpp") || suffix.contains(".hpp") || suffix.contains(".txt")) {
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

        if(link.contains("https://github.com/") && extension.equals(".git")) //TODO: Perhaps a better validation can be used here...
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
        return null;
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
        return new String[0];
    }

    public int[] getFromResults(metric_mode requestedMetric)
    {
        int[] metrics = new int[results.size()];

        for(int i = 0; i < metrics.length; i++)
        {
            if(requestedMetric == metric_mode.WORDS)
                metrics[i] = results.get(i).getWordCount();
            else if(requestedMetric == metric_mode.CHARACTERS)
                metrics[i] = results.get(i).getCharacterCount();
            else if(requestedMetric == metric_mode.LINES)
                metrics[i] = results.get(i).getLineCount();
            else if(requestedMetric == metric_mode.SOURCES)
                metrics[i] = results.get(i).getSourceCount();
            else if(requestedMetric == metric_mode.COMMENTS)
                metrics[i] = results.get(i).getCommentCount();
            else
                metrics[i] = -1;
        }
        return metrics;
    }

    public String [] [] getCompleteFile(){
        String [][] completeFile = new String [6][getNumFiles()];
        String [] fileNames = getFileNames();
        int[] characters = getCharacterCount();
        int[] words = getWordCount();
        int[] lines = getLineCount();
        int[] sourceLines = getSourceCount();
        int[] commentLines = getCommentCount();

        for (int i = 0; i < getNumFiles();i++){
            completeFile[0][i] = fileNames[i];
            completeFile[1][i] = characters.toString();
            completeFile[2][i] = words.toString();
            completeFile[3][i] = lines.toString();
            if(sourceLines[i] >= 0 ) {
                completeFile[4][i] = sourceLines.toString();
            }else{
                completeFile[4][i] = "N/A";
            }
            if(commentLines[i] >= 0) {
                completeFile[5][i] = commentLines.toString();
            }else{
                completeFile[5][i] = "N/A";
            }
        }
        return completeFile;
    }
}