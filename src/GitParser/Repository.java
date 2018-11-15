package GitParser;

import java.io.File;

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
        listRepositoryFiles(fileEntry);
      else
        System.out.println(fileEntry.getName());
    }
  }
}
