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

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collection;
import java.util.Iterator;

public class Repository
{
  private final File repository; //TODO: Not sure if this should be 'final'.

  public Repository(File repository)
  {
    this.repository = repository;
  }

  /* Displays all the files in the repository */
  public void ls() throws IOException
  {
    Files.walk(Paths.get(repository.getPath()))
            .filter(Files::isRegularFile)
            .forEach(System.out::println);
  }


  //TODO: May need to rework this...
  public Queue<File> getRequestedFiles(String query) throws EmptyStackException
  {
    Queue<File> requested_files = new LinkedList<File>();
    try {
      boolean recursive = true;

      Collection files = FileUtils.listFiles(repository, null, recursive);

      for (Iterator iterator = files.iterator(); iterator.hasNext();) {
        File file = (File) iterator.next();
        if (file.getName().contains(query))
        {
          //System.out.println("Inserting: " + file.getAbsolutePath());
          requested_files.add(file);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return requested_files;
  }
}
