/***********************************************************************************
 * Programmer(s): Jenzel Arevalo
 *
 * Class: Downloader
 *
 * Class Description:
 * Downloads a file from a given URL and outputs the downloaded file to a given
 * path for the file to be saved.
 *
 * External Contributions:
 * + Overall algorithm for downloading a file via URL - Zoran Davidovic
 *   https://www.youtube.com/watch?v=rd6m-6l2xQQ
 **********************************************************************************/

package GitParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Downloader implements Runnable
{
    private String link;        //link to file
    private File out;           //contains downloaded file

    public Downloader(String link, File out)
    {
        this.link = link;
        this.out = out;
    }

    @Override
    public void run()
    {
        try
        {
            URL url = new URL(link);
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            double fileSize = (double)http.getContentLengthLong();  //file size to see progress of download
            BufferedInputStream in = new BufferedInputStream(http.getInputStream()); //
            FileOutputStream fos = new FileOutputStream(this.out);
            BufferedOutputStream bout = new BufferedOutputStream(fos, 1024); //1024 = 1KB
            byte[] buffer = new byte[1024];
            double downloaded = 0.00;
            int read = 0;
            double percentDownloaded = 0.00;

            while((read = in.read(buffer, 0, 1024)) >= 0) //when -1 is received, we reached end of buffered input stream
            {
                bout.write(buffer, 0, read);
                downloaded += read;
                percentDownloaded = (downloaded * 100) / fileSize;
                String percent = String.format("%.4f", percentDownloaded);
                System.out.println("Downloaded " + percent + " of file");
            }
            bout.close();
            in.close();
            System.out.println("Download complete");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public File getOutputFile() throws FileNotFoundException
    {
        if(out == null)
            throw new FileNotFoundException("getOutputFile - File does not exist.");
        else
            return out;
    }
}
