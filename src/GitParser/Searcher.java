package GitParser;

import java.io.File;
import java.io.FilenameFilter;


public class Searcher
{
    public void recursiveSearch(File path, String searchQuery)
    {
        printFiles(getTargetFiles(path, searchQuery));
        for (File file : path.listFiles())
        {
            if (file.isDirectory())
                recursiveSearch(file, searchQuery);
        }
        if (path.isDirectory())
            printFiles(getTargetFiles(path, searchQuery));
    }

    //TODO: Should this method be refactored to getTargetFiles method to minimize redundancy? Although its slightly different from getTargetFiles, they almost look similar
    /* Simple method to display all files in a repository */
    public void listRepositoryFiles(final File repository)
    {
        if(repository == null)
        {
            System.out.println("Empty repository");
        }
        else
        {
            for (final File fileEntry : repository.listFiles())
            {
                if (fileEntry.isDirectory())
                {
                    listRepositoryFiles(fileEntry);
                }
                else
                    System.out.println(fileEntry.getPath() + "\n\t\t" + fileEntry.getName() + "\n");
            }
        }
    }

    private String[] getTargetFiles(File repository, String searchQuery)
    {
        if(repository == null)
            return null;

        String[] files = repository.list(new FilenameFilter()
        {
            @Override
            public boolean accept(File dir, String name)
            {
                return name.endsWith(searchQuery);
            }
        });

        return files;
    }

    private void printFiles(String[] targets)
    {
        for(String target : targets)
        {
            System.out.println(target);
        }
    }
}