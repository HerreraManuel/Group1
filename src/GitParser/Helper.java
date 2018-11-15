package GitParser;

import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

import java.io.IOException;

//TODO: CLASS OBSOLETE - LEAVING IN CODE FOR FUTURE USE
public class Helper
{
    public static Repository openJGitRepository() throws IOException
    {
        FileRepositoryBuilder builder = new FileRepositoryBuilder();
        return builder.readEnvironment().findGitDir().build();
    }
}
