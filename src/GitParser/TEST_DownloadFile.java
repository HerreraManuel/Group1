package GitParser;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TEST_DownloadFile
{
  public static void main(String[] args)
  {
      TEST_DownloadFile instance = new TEST_DownloadFile();
      instance.run(args);
  }

  public void run(String[] args)
  {
      try
      {
          downloadFile(args);
      }
      catch (Exception e)
      {
          System.out.println(e.getMessage());
      }
  }

  //TODO: Continue with Implementation
  public void downloadFile(String[] args) throws MalformedURLException, IOException
  {
      String downloadURL = args[0];
      String fileName = "testFile";

      try (InputStream in = URI.create(downloadURL).toURL().openStream())
      {
          Files.copy(in, Paths.get(fileName));
      }
  }
}
