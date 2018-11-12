/***********************************************************************************
 * Programmer(s): Jenzel Arevalo
 *
 * Class: GitParser_TestMain
 *
 * Class Description:
 * Tests to see if Downloader class works.
 *
 * Bugs/Anomalies:
 * + TODO [MODERATE-PRIORITY]: Patch OS Path Download Compatibility
 *   Given its current state, Windows Users are able to download files and not
 *   Linux or MacOS users. This is most likely due to the way in which the string
 *   in the File constructor is inputted for -nix based Systems. The solution may
 *   be to rely on a Java library that can be utilized to navigate the system's
 *   directory to determine what operating system the program is running on.
 **********************************************************************************/

package GitParser;

import java.io.File;

public class GitParser_TestMain
{
    public static void main(String[] args)
    {
        String link = "https://pdfs.semanticscholar.org/efb2/58d7812128aa19709520b1a567da98227cc5.pdf"; //TEST: "A Concise Introduction to Software Engineering" PDF file

        /* TODO: Windows Users - Please specify the path AND name of the pdf file you would like to use
        *  For instance, Zoran David's file will be downloaded here:
        *  File out = new File("C:\\Users\\Zoran David\\Desktop\\Java The Complete.pdf");
        */

        File out = new File(""); //TODO: type in path name here


        new Thread(new Downloader(link, out)).start();
    }
}
