/*************************************************************************************
 Programmer(s): Jenzel Arevalo

 Class Description:
 Custom exception class that insulates and identifies errors that may occur from
 the RepositoryAnalyzer class
 ************************************************************************************/

package RepositoryAnalyzer;


//TODO: MARKED FOR DELETION - In interest of time, not necessary for implementation
public class RepositoryAnalyzerException extends Exception
{
    public RepositoryAnalyzerException(String s)
    {
        super(s);
    }
}
