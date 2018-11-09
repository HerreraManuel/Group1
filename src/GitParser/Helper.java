/*
Programmer(s): Jenzel Arevalo

Class Description:
GitParser.Helper assists with the creation and opening of Git repositories

External Contributions:
+ JGit External Library
  http://www.eclipse.org/jgit/

+ Examples for opening git repositories - designed by mobiblunt, maibin
  https://github.com/eugenp/tutorials/tree/master/JGit/src/main/java/com/baeldung/jgit
*/

package GitParser;

import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import java.io.File;
import java.io.IOException;

/*** Helper Class ***/
public class Helper
{
    public static Repository openJGitRepository() throws IOException
    {
        FileRepositoryBuilder builder = new FileRepositoryBuilder();
        return builder
                .readEnvironment() // scan environment GIT_* variables
                .findGitDir() // scan up the file system tree
                .build();
    }

    public static Repository createNewRepository() throws IOException
    {
        File localPath = File.createTempFile("TestRepo", "");
        if(!localPath.delete())
        {
            throw new IOException("Unable to delete temporary file: " + localPath);
        }
        Repository repository = FileRepositoryBuilder.create(new File(localPath, ".git"));
        repository.create();
        return repository;
    }
}