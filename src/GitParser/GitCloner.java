/***********************************************************************************
 * Programmer(s): Jenzel Arevalo
 *
 * Class: GitCloner
 *
 * Class Description:
 * Clones a Git repository from a given URL and outputs the downloaded file to a
 * given path for the file to be saved.
 *
 * External Contributions:
 * + How to Clone Git Repositories with JGit
 *   https://www.codeaffine.com/2015/11/30/jgit-clone-repository/
 **********************************************************************************/

package GitParser;

import java.io.File;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

//TODO: Class is Unstable - Further development is needed
public class GitCloner
{
  public GitCloner()
  {
  }

  public void cloneRepository(String url, File workDirectory) throws GitAPIException
  {
      Git git = Git.cloneRepository()
                    .setURI(url)
                    .setDirectory(workDirectory) //TODO: Determine a place to store repository for specific OS, will save to a Linux
                    .call();
  }
}
