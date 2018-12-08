package RepositoryAnalyzer;

import GitParser.GitParser;
import GitParser.GitParserException;
import GitParser.Repository;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RepositoryAnalyzer_TestMain
{
  public static void main(String[] args)
  {
      RepositoryAnalyzer_TestMain instance = new RepositoryAnalyzer_TestMain();
      instance.run(args);
  }

  public void run(String[] args)
  {
      ArrayList<Result> results = new ArrayList<Result>();

      //Valid URL
      String validURL = "https://github.com/jenzelarevalo/Personal.git";
      String validURL2 = "https://github.com/jenzelarevalo/SampleRepo.git";

      //Invalid URL
      String invalidURL = "https://pdfs.semanticscholar.org/efb2/58d7812128aa19709520b1a567da98227cc5.pdf";

      try
      {
          GitParser parser = new GitParser();
          File repository = parser.getGitRepo(validURL2);
          Repository r = new Repository(repository);
          Queue<File> queue = new LinkedList<>();

          //r.ls();
          queue = r.getAllFiles();

          while(!queue.isEmpty())
          {
              Analyzer analyzer = new Analyzer(queue.element()); //TODO: will have to be invoked by Result class
              results.add(analyzer.getResult()); //TODO: stores result into results arraylist
              queue.remove();
          }

          for(int i = 0; i < results.size(); i++)
          {
              System.out.println(results.get(i));
          }

          System.out.println("\n\n\n");
          System.out.println("Delete " + repository.getName() + "?");
          Scanner input = new Scanner(System.in);
          String response = input.nextLine();
          if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("YES"))
          {
              deleteDirectory(repository);
              System.out.println("File deleted.");
          }
      }
      catch
      (GitAPIException e)
      {
        e.printStackTrace();
      }
      catch (GitParserException e)
      {
          e.printStackTrace();
      }
      catch(IOException e)
      {
        e.printStackTrace();
      }
  }

    /* Deletes a directory with subdirectories */
    public static boolean deleteDirectory(File dir)
    {
        if (dir.isDirectory())
        {
            File[] children = dir.listFiles();
            for (int i = 0; i < children.length; i++)
            {
                boolean success = deleteDirectory(children[i]);
                if (!success)
                {
                    return false;
                }
            }
        }
        // either file or an empty directory
        return dir.delete();
    }
}
