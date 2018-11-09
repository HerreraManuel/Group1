/*
Programmer(s): Jenzel Arevalo

Class Description:
GitParser.GitParser utilizes the JGit external library to retrieve and process GitHub repositories.

External Contributions:
+ JGit External Library
  http://www.eclipse.org/jgit/

+ Examples for opening git repositories - designed by mobiblunt, maibin
  https://github.com/eugenp/tutorials/tree/master/JGit/src/main/java/com/baeldung/jgit
*/

package GitParser;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;

import java.io.File;
import java.io.IOException;

//TODO: UNIT UNDER TEST - CURRENTLY UNSTABLE
public class GitParser
{
    public static void main(String[] args) throws IOException, GitAPIException
    {
        GitParser instance = new GitParser();
        instance.run(args);
    }

    public void run(String[] args) throws IOException, GitAPIException
    {
        File repoDir = createSampleGitRepo();
    }

    private File createSampleGitRepo() throws IOException, GitAPIException
    {
        try(Repository repository = Helper.createNewRepository())
        {

        }
    }
}
