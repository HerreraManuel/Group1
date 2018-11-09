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
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

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
        File repo_directory = createSampleGitRepo();

        FileRepositoryBuilder builder = new FileRepositoryBuilder();
        try(Repository repository = builder.setGitDir(repo_directory).readEnvironment().findGitDir().build())
        {
            System.out.println("Having repository: " + repository.getDirectory());

            Ref head = repository.exactRef("refs/head/master");
            System.out.println("Ref of refs/heads/master: " + head);
        }
    }

    private File createSampleGitRepo() throws IOException, GitAPIException
    {
        try(Repository repository = Helper.createNewRepository())
        {
            System.out.println("Temporary repository at: " + repository.getDirectory());

            //Create file
            File file = new File(repository.getDirectory().getParent(), "test_file");
            if(!file.createNewFile())
            {
                throw new IOException("File could not be created " + file);
            }

            //Run add-call
            try (Git git = new Git(repository))
            {
                git.add().addFilepattern("test_file").call();
                git.commit().setMessage("Added test_file").call();
            }
            System.out.println("Added file " + file + "to repository at " + repository.getDirectory());
            return repository.getDirectory();
        }
    }
}
