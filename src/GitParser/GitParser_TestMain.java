/***********************************************************************************
 Programmer(s): Jenzel Arevalo

 Class: GitParser_TestMain

 Class Description:
 Tests to see if Downloader class works.

 Notes:

 Given its current state, Windows, Linux, and MacOS users are able to clone Git
 repositories to their system.

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
        /********* GitParser Test Code *********/

        //TODO: Instructions to get GitParser Test Code Running
        //1. Choose one of the valid or invalid URLs below
        //2. In GitParser class, see line 40 and specify a file path and folder name that you would like to save the repo to, read the header comment of this file for an example of what to write

        //Valid URLs
        String validURL = "https://github.com/CSC131Fall2018/Group1.git";
        String validURL2 = "https://github.com/lemire/javaewah.git";

        //Invalid URLs
        String invalidURL = "https://pdfs.semanticscholar.org/efb2/58d7812128aa19709520b1a567da98227cc5.pdf";

        try
        {
            //GitParser test = new GitParser(invalidURL); //Should throw IOException labeled 'GitParser - Invalid link!'
            GitParser test = new GitParser(); //Should be able to download gitFile, downloads a file, but does not seem to look like a git repository

            File f = test.getGitRepo(validURL2); //TODO: <---- ENTER URL variable here

            Repository repo = new Repository(f);
            repo.ls();
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
