/*************************************************************************************
 Programmer(s): Jenzel Arevalo

 Class Description:


 External Contributions:
 + Code Affine - How to Clone a Git Repository w. JGit
   https://www.codeaffine.com/2015/11/30/jgit-clone-repository/
 ************************************************************************************/

package GitParser;

import org.eclipse.jgit.api.errors.GitAPIException;
import java.io.File;
import java.io.IOException;

public class GitParser
{
    public GitParser()
    { }

    //TODO: might need to rework Clone constructor to not include output file, we can "hardcode" a location to store the file as user does not need to specify where to save file
    public File getGitRepo(String link) throws IOException, GitAPIException
    {
        File out = new File("/home/filipinoy/Desktop/Test4"); //TODO: <--- Modify this constructor with a string that includes the filepath and folder name that you wish to clone the repository to.
        //File out = new File("X:\\Java\\TestRepo"); // Manny's Test Folder
        GitCloner cloner = new GitCloner();
        cloner.cloneRepository(link, out);
        return out;
    }

    /* Notes:
     * If it is a valid .git repository (we can check via URL), we need to CLONE
     * the repository and save to a local file. Once the file has been successfully downloaded,
     * we need to go find the repository's file path and use it to open the repository.
     */

    //Verify that given link leads to a git file
    private boolean isGitURL(String link) //TODO: MARKED FOR DELETION
    {
        String extension = link.substring(link.lastIndexOf("."));
        String websiteAddress = "https://github.com/";

        if(link.contains("https://github.com/") && extension.equals(".git")) //TODO: Perhaps a better validation can be used here...
        {
            System.out.println("Valid Git URL");
            return true;
        }
        else
            return false;
    }
}
