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
  private final File repository; //TODO: Not sure if this should be 'final'.

  public Repository(File repository)
  {
    this.repository = repository;
  }

  /* Interface method to execute recursive listRepositoryFiles method */
  public void ls()
  {
    Searcher instance = new Searcher();
    instance.listRepositoryFiles(repository);
  }

  //TODO: May need to rework this...
  public void getRequestedFiles(String requested_ext) throws EmptyStackException
  {
    //final Stack<File> requestedFiles = new Stack<File>();
    Searcher instance = new Searcher();
    instance.recursiveSearch(repository, requested_ext);
    //return requestedFiles;
  }
}
