package FileHelper;

import java.io.File;
import java.io.FileFilter;

public class CustomFileFilter implements FileFilter
{
  private String ignoreFolderName = ".git";

  @Override
  public boolean accept(File f)
  {
      if(f.isDirectory())
      {
          File[] subFiles = f.listFiles();
          for(File file : subFiles)
          {
              if(file.getName().equalsIgnoreCase(ignoreFolderName))
              {
                  return true;
              }
          }
      }
      return false;
  }
}
