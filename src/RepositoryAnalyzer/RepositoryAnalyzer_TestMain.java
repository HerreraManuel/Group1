package RepositoryAnalyzer;

import GitParser.GitParser;
import GitParser.Repository;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Queue;

public class RepositoryAnalyzer_TestMain
{
  public static void main(String[] args)
  {
      RepositoryAnalyzer_TestMain instance = new RepositoryAnalyzer_TestMain();
      instance.run(args);
  }

  public void run(String[] args)
  {
      //Valid URL
      String validURL = "https://github.com/jenzelarevalo/Personal.git";

      //Invalid URL
      String invalidURL = "https://pdfs.semanticscholar.org/efb2/58d7812128aa19709520b1a567da98227cc5.pdf";

      try
      {
          GitParser parser = new GitParser();
          File repository = parser.getGitRepo(invalidURL);
          Repository r = new Repository(repository);
          Queue<File> queue = r.getRequestedFiles(".c");

          while(!queue.isEmpty())
          {
              Analyzer analyzer = new Analyzer(queue.element());
              queue.remove();
          }
      }
      catch
      (GitAPIException e)
      {
        e.printStackTrace();
      }
      catch(IOException e)
      {
        e.printStackTrace();
      }
  }
}
