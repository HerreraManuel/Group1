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

import javax.security.auth.Subject;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Analyzer
{
    private Lines lines;
    private Characters characters;
    private Words words;
    private SourceLine sourceLine;
    private CommentLine commentLine;

    public Analyzer(File f)
    {
        try
        {
            String fileContent = readFileContents(f.getPath());
            performMetrics(fileContent);

                    /*
        if(isSourceFile(f.getName()))
        {
            commentLine = new CommentLine(fileContent); //TODO: CommentLine class under implementation
            sourceLine = new SourceLine(fileContent); //TODO: SourceLine class under implementation
        }
        */

            //characters = new Characters(fileContent); //TODO: Characters class under implementation
        }catch(IOException e)
        {
            System.out.println("Unable to read file contents");
        }
    }

    //TODO: Refactor this after tests checkout, no print outs should be in this method; may need to refactor some methods in Metrics class
    public void performMetrics(String fileContent)
    {
        System.out.println(fileContent);
        System.out.println("\n");
        System.out.println("Line Count: " + lines.lineCount(fileContent));
        System.out.println("Word Count: " + words.wordCount(fileContent));
    }














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

    private Boolean isSourceFile(String fileName)
    {
        String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        FileExtensions list = new FileExtensions();

        for(int i = 0; i < list.getSourceExtensionsSize(); i++)
        {
            if(fileExtension.equals(list.getSourceExtensions(i)))
                return true;
        }
        return false;
    }
}