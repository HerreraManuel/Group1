/*************************************************************************************
 Programmer(s): Jenzel Arevalo

 Class Description:
 Custom exception class that insulates and identifies errors that may occur from
 the RepositoryAnalyzer class
 ************************************************************************************/

package RepositoryAnalyzer;


//TODO: Is this really it for a custom exception class?
public class RepositoryAnalyzerException extends Exception
{
    public RepositoryAnalyzerException(String s)
    {
        super(s);
    }
}
