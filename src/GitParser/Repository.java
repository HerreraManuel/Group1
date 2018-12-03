/***********************************************************************************************
 Programmer(s): Jenzel Arevalo

 Class Description:
 Repository class holds a single repository. This class is able to perform certain functions with
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
import java.util.*;

public class Repository {
  private final File repository; //TODO: Not sure if this should be 'final'.

  public Repository(File repository) {
    this.repository = repository;
  }

  /* Displays all the files in the repository */
  public void ls() throws IOException {
    Files.walk(Paths.get(repository.getPath()))
            .filter(Files::isRegularFile)
            .forEach(System.out::println);
  }

  /* Obtains all files of a particular type in the repository */
  public Queue<File> getRequestedFiles(String query) throws EmptyStackException
  {
    Queue<File> requested_files = new LinkedList<File>();
    ArrayList<String> queries = processQueries(query);
    try
    {
      boolean recursive = true;
      Collection files = FileUtils.listFiles(repository, null, recursive);

      for (Iterator iterator = files.iterator(); iterator.hasNext(); )
      {
        File file = (File) iterator.next();
        for (int i = 0; i < queries.size(); i++)
        {
          if (file.getName().contains(".") && file.getName().substring(file.getName().lastIndexOf(".")).equals(queries.get(i))) //TODO: Works, but this might need to be refactored later...
          {
            //System.out.println("Inserting: " + file.getAbsolutePath());
            requested_files.add(file);
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return requested_files;
  }

  //TODO: Needs to be fixed
  /* Obtains all files regardless of type */
  public Queue<File> getAllFiles() throws EmptyStackException
  {
    Queue<File> allFiles = new LinkedList<File>();
    try
    {
      boolean recursive = true;
      Collection files = FileUtils.listFiles(repository, null, recursive);
      for (Iterator iterator = files.iterator(); iterator.hasNext(); )
      {
        File file = (File) iterator.next();
        System.out.println("Inserting: " + file.getAbsolutePath());
        allFiles.add(file);
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return allFiles;
  }

  /* Processes a string of queries and returns them in an arraylist */
  private ArrayList<String> processQueries(String queries)
  {
    if(queries == "")
    {
      return null;
    }
    else
    {
      ArrayList<String> queriesList = new ArrayList<>();
      String result = queries.replace(",", " ");
      StringTokenizer st = new StringTokenizer(result);
      while (st.hasMoreTokens())
      {
        queriesList.add(st.nextToken());
      }
      return queriesList;
    }
  }

}
