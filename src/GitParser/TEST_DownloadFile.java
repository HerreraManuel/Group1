package GitParser;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.io.File;
import java.nio.Buffer;

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
          File file = downloadFile(args);
      }
      catch (Exception e)
      {
          System.out.println(e.getMessage());
      }
  }

  //TODO: Continue with Implementation
  public File downloadFile(String[] args)
  {
      String downloadURL = args[0];

      try(BufferedInputStream in = new BufferedInputStream(new URL(downloadURL).openStream());
          FileOutputStream fileOutputStream = new FileOutputStream(downloadURL)) {
          byte dataBuffer[] = new byte[1024];
          int bytesRead;
          while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
              fileOutputStream.write(dataBuffer, 0, bytesRead);
          }
      }
      catch(IOException e)
      {
          System.out.println("Error downloading file");
      }
    return null;
  }
}
