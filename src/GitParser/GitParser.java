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

import Helper.SystemIdentifier;

public class GitParser
{
    public GitParser()
    { }

    public File getGitRepo(String link) throws IOException, GitAPIException, GitParserException
    {
        //File out = new File("/hokffgsdfg"); //TODO: <--- Modify this constructor with a string that includes the filepath and folder name that you wish to clone the repository to.
        //File out = new File("X:\\Java\\TestRepo"); // Manny's Test Folder
        //File out = new File("/home/filipinoy/Desktop/GitRepo");

        File repositoryFolder = new File(createFolderPath());

        GitCloner cloner = new GitCloner();
        cloner.cloneRepository(link, repositoryFolder);
        return repositoryFolder;
    }

    private String createFolderPath() throws GitParserException
    {
        SystemIdentifier os_identifier = new SystemIdentifier();
        String os = os_identifier.identify();

        if(os.equalsIgnoreCase("WINDOWS"))
        {
            return "C:\\Users\\Documents";
        }
        else if(os.equalsIgnoreCase("MAC")) //TODO: TO BE TESTED
        {
            //return "~/.local/Temp_GitRepository";
            return "~/Temp_GitRepository";
        }
        else if(os.equalsIgnoreCase("LINUX/UNIX"))
        {
            return "~/.local/Temp_GitRepository";
        }
        else
        {
            throw new GitParserException("GitParserException: Unknown operating system, cannot create repository folder");
        }
    }
}
