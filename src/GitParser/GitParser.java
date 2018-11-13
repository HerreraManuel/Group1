/*
 * Programmer(s): Jenzel Arevalo
 *
 * Class Description:
 *
 *
 * External Contributions:
 * + OpenRepository Procedure (mobiblunt and maibin)
 *   https://github.com/eugenp/tutorials/blob/master/JGit/src/main/java/com/baeldung/jgit/OpenRepository.java
 *
 */

package GitParser;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import java.io.File;
import java.io.IOException;

public class GitParser
{
    public GitParser(String link) throws IOException, GitAPIException
    {
        boolean validURL = isGitURL(link);

        if(validURL)
            getGitRepo(link);
        else
            throw new IOException("GitParser - Invalid link!");
    }

    //TODO: might need to rework Downloader constructor to not include output file, we can "hardcode" a location to store the file as user does not need to specify where to save file
    public void getGitRepo(String link) throws IOException, GitAPIException
    {
        File out = new File("/home/filipinoy95/Desktop/TestGitFile"); //TODO: Find a location to temporarily save file
        new Thread(new Downloader(link, out)).start();
    }

    /* TODO: For tonight...
     * Downloader is working properly for Windows-based systems
     * If it is a valid .git repository (we can check via URL), we need to download
     * the repository and download the file. Once the file has been successfully downloaded,
     * we need to go find the download file's path and use it to open the repository.
     */

    //Verify that given link leads to a git file
    public boolean isGitURL(String link)
    {
        String fileExtension = link.substring(link.lastIndexOf("."));
        if(fileExtension.equals(".git"))
        {
            System.out.println("Valid Git URL");
            return true;
        }
        else
            return false;
    }

}
