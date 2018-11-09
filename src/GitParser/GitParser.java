/*
 * Programmer(s): Jenzel Arevalo
 *
 * Class Description:
 *
 *
 * External Contributions:
 *
 * + OpenRepository Procedure (mobiblunt)
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
  public static void main(String[] args) throws IOException, GitAPIException
  {
      GitParser instance = new GitParser();
      instance.run(args);
  }

  public void run(String[] args) throws IOException, GitAPIException
  {
    File repoDir; //TODO: Need path to .git repository file here

  }
}
