/*************************************************************************************
 Programmer(s): Jenzel Arevalo

 Class Description:
 Custom exception class that insulates and identifies errors that may occur from
 the GitParser class
 ************************************************************************************/

package GitParser;


public class GitParserException extends Exception
{
  public GitParserException(String s)
  {
      super(s);
  }
}
