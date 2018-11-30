/***********************************************************************************
 Programmer(s): Jenzel Arevalo

 Class: GitCloner

 Class Description:
 Clones a Git repository from a given URL and outputs the downloaded file to a
 given path for the file to be saved.

 External Contributions:
  + How to Clone Git Repositories with JGit
    https://www.codeaffine.com/2015/11/30/jgit-clone-repository/
 **********************************************************************************/
package GitParser;

import java.io.File;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

public class GitCloner
{
  public GitCloner()
  {}

  /* Clones a Git repository from a given URL and output file */
  public void cloneRepository(String url, File outputFile) throws GitAPIException
  {
    Git git = Git.cloneRepository()
            .setURI(url)
            .setDirectory(outputFile)
            .call();
  }
}