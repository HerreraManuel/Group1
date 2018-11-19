/***********************************************************************************************
 Programmer(s): Jenzel Arevalo

 Class Description:
 Repository class holds a sing repository. This class is able to perform certain functions with
 the repository, such as finding specific files, listing all files in the repository, etc.

 External Contributions:
 + Stack Overflow user Gearon's Recursive approach to searching for specific files in a Folder
 https://stackoverflow.com/questions/4852531/find-files-in-a-folder-using-java
 **********************************************************************************************/

package GitParser;

import java.io.File;
import java.io.FilenameFilter;
import java.util.EmptyStackException;
import java.util.Stack;

public class Repository
{
  private final File root; //TODO: Not sure if this should be 'final'.

  public Repository(File repository)
  {
    root = repository;
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
  public Stack<File> getRequestedFiles(String requested_ext) throws EmptyStackException
  {
    final Stack<File> requestedFiles = new Stack<File>();

    return requestedFiles;
  }
}
