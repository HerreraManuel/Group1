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
import java.io.FileInputStream;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import Helper.SystemIdentifier;

public class GitParser
{
    public GitParser()
    { }

    public File getGitRepo(String link) throws IOException, GitAPIException, GitParserException
    {
        String repositoryName = link.substring(link.lastIndexOf("/"));
        File repositoryFolder = new File(createFolderPath(repositoryName));

        GitCloner cloner = new GitCloner();
        cloner.cloneRepository(link, repositoryFolder);
        return repositoryFolder;
    }

    private String createFolderPath(String repositoryName) throws GitParserException
    {
        SystemIdentifier os_identifier = new SystemIdentifier();
        String os = os_identifier.identify();

        if(os.equalsIgnoreCase("WINDOWS")) //TODO: TO BE TESTED
        {
            String path = System.getProperty("user.home") + File.separator + "Desktop";
            path += File.separator + "GitRepositories";
            Path root = Paths.get(path);
            if(Files.exists(root))
            {
                String repositoryPath = root + File.separator + repositoryName;
                Path rp = Paths.get(repositoryPath);
                if(Files.exists(rp))
                {
                    int i = 1;
                    do {
                        String duplicateName = root + File.separator + repositoryName + "(" + (i++) + ")";
                        rp = Paths.get(duplicateName);
                    } while (Files.exists(rp));
                    path = rp.toString();
                }
            }
            else
            {
                path = root + repositoryName;
            }
            return path;
        }
        else if(os.equalsIgnoreCase("MAC")) //TODO: TO BE TESTED
        {
            //return "~/.local/Temp_GitRepository";
            return "/Temp_Repository";
        }
        else if(os.equalsIgnoreCase("LINUX/UNIX")) //VERIFIED
        {
            String path = System.getProperty("user.home") + File.separator + "Desktop";
            path += File.separator + "Temp_GitRepository";
            return path;
        }
        else
        {
            throw new GitParserException("GitParserException: Unknown operating system, cannot create repository folder");
        }
    }
}
