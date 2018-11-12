/***********************************************************************************
  Programmer(s): Jenzel Arevalo

  Class: GitParser_TestMain

  Class Description:
  Tests to see if Downloader class works.

  Notes:

    Given its current state, Windows, Linux, and MacOS users are able to download
    files to their system.

    It should be noted that the path to the output file differs for Windows
    and -nix based systems.

    For Windows...
    The output file path should look like:
      C:\\some\\path\\for\\output\\file

    For Linux and MacOS...
    The output file path should look like:
      /home/username/path/for/output/file

    *Notice the double back-slash for the Windows file path.
 **********************************************************************************/

package GitParser;

import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.File;
import java.io.IOException;

public class GitParser_TestMain
{
    public static void main(String[] args)
    {
        /********* Downloader Test Code *********/
        //String link = "https://pdfs.semanticscholar.org/efb2/58d7812128aa19709520b1a567da98227cc5.pdf"; //TEST: "A Concise Introduction to Software Engineering" PDF file

        /* Example for Windows based Systems */
        //File out = new File("C:\\Users\\Zoran David\\Desktop\\Java The Complete.pdf")

        /* Example for -nix based Systems */
        //File out = new File("/home/filipinoy95/Downloads/A Concise Introduction to Software Engineering.pdf");

        File out = new File (" "); //TODO: Enter a valid path and file name with extension

        //new Thread(new Downloader(link, out)).start(); //TODO: Uncomment this if you want to test Downloader class
        /**** Downloader Test Code Ends Here ****/


        /********* GitParser Test Code *********/
        String validURL = "https://github.com/CSC131Fall2018/Group1.git";
        String invalidURL = "https://pdfs.semanticscholar.org/efb2/58d7812128aa19709520b1a567da98227cc5.pdf";
        try
        {
            GitParser test = new GitParser(invalidURL); //Should throw IOException labeled 'GitParser - Invalid link!'
            test = new GitParser(validURL); //Should be able to download gitFile, downloads a file, but does not seem to look like a git repository
        }
        catch (GitAPIException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        /**** GitParser Test Code Ends Here ****/
    }
}
