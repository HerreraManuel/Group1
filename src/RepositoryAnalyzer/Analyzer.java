/***********************************************************************************************
 Programmer(s): Jenzel Arevalo

 Class Description:
 Analyzer class is what processes the metrics for a single file received from a Repository class.
 Currently, the current design of the analyzer class is to process all metrics possible.
 That way, all possible metrics for the file are taken when requested.

 **********************************************************************************************/

package RepositoryAnalyzer;

import Metrics.Characters;
import Metrics.Words;
import Metrics.Lines;
import Metrics.SourceLine;
import Metrics.CommentLine;

import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Analyzer
{
    private Result result; //TODO: Should a Result object exist in Analyzer class? Who invokes who?
    private String fileName;
    private Lines lines;
    private Characters characters;
    private Words words;
    private SourceLine sourceLine;
    private CommentLine commentLine;

    public Analyzer(File f)
    {
        //TODO: Instantiation of these objects here look ugly... Problem?
        lines = new Lines();
        words = new Words();
        characters = new Characters();
        sourceLine = new SourceLine();
        commentLine = new CommentLine();

        try
        {
            String fileContent = readFileContents(f.getPath());
            fileName = f.getName();
            boolean enableSourceMetric = isSourceFile(fileName);
            performMetrics(fileContent, enableSourceMetric);
        }catch(IOException e)
        {
            System.out.println("Unable to read file contents");
        }
    }

    /* Performs the metrics for the given file content and a flag to determine if a source and comment metric are needed for it */
    public void performMetrics(String fileContent, boolean sourceMetricFlag)
    {
        int lineCount = lines.lineCount(fileContent);
        int wordCount = words.wordCount(fileContent);
        int characterCount = characters.characterCount(fileContent);

        int sourceCount;
        int commentCount;

        if(sourceMetricFlag == false)
        {
          sourceCount = 0;
          commentCount = 0;
        }
        else
        {
          sourceCount = sourceLine.sourceLine(fileContent);
          commentCount = commentLine.commentLine(fileContent);
        }

        result = new Result(fileName, characterCount, wordCount, lineCount, sourceCount, commentCount);
    }

    /* Extracts the contents of a file with a given file path and returns a single string containing the file content */
    private String readFileContents(String filePath) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader (filePath));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        try
        {
            while((line = reader.readLine()) != null)
            {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            return stringBuilder.toString();
        }
        finally
        {
            reader.close();
        }
    }

    /* Determines if the given fileName indicates a source file */
    private Boolean isSourceFile(String fileName)
    {
        //System.out.println(fileName);
        if(fileName.contains("."))
        {
            String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
            FileExtensions list = new FileExtensions();
            for (int i = 0; i < list.getSourceExtensionsSize(); i++) {
                if (fileExtension.equals(list.getSourceExtensions(i)))
                    return true;
            }
            return false;
        }
        return false;
    }

    /* Getter for the metrics result for a file */
    public Result getResult()
    {
        return result;
    }
}