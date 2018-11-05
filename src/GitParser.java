/*
Programmer(s): Jenzel Arevalo

Class Description:
GitParser utilizes the JGit external library to retrieve and process GitHub repositories.

External Contributions:
+ JGit External Library
  http://www.eclipse.org/jgit/

+ Examples for opening git repositories - designed by mobiblunt, maibin
  https://github.com/eugenp/tutorials/tree/master/JGit/src/main/java/com/baeldung/jgit
*/

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
        instance.execute(args);
    }

    public void execute(String[] args) throws IOException, GitAPIException
    {

    }




    /*** Helper Class ***/
    public class Helper
    {
      public Repository openJGitRepository() throws IOException
      {
          FileRepositoryBuilder builder = new FileRepositoryBuilder();
          return builder
                  .readEnvironment() // scan environment GIT_* variables
                  .findGitDir() // scan up the file system tree
                  .build();
      }

      public Repository createNewRepository() throws IOException
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
}
