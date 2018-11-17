package GitParser;

import java.io.File;
import java.util.EmptyStackException;
import java.util.Stack;

public class Repository
{
  public Repository()
  {
  }

  public void listRepositoryFiles(final File repository)
  {
    for(final File fileEntry : repository.listFiles())
    {
      if(fileEntry.isDirectory())
      {
        System.out.println("\n");
        System.out.println(fileEntry.getParent());
        System.out.println("-------------------------------------------------------------");
        listRepositoryFiles(fileEntry);
      }
      else
        System.out.println("\t\t" + fileEntry.getName());
    }
  }

  //TODO: May need to rework this...
  public Stack<File> getRequestedFiles(final File repository, String extension) throws EmptyStackException
  {
    Stack<File> requestedFiles = new Stack<File>();



    return requestedFiles;
  }
}
