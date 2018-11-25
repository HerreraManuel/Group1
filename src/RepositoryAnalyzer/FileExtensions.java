/******************************************************************************************************
 Programmer(s): Jenzel Arevalo

 Class Description:
 Simple helper class to hold lists of different types of extensions. FileExtensions class implemented
 with consideration of future additions and ease of implementing new extensions to program

 ****************************************************************************************************/

package RepositoryAnalyzer;

import java.util.ArrayList;

public class FileExtensions
{
  private ArrayList<String> sourceExtensions;
  private ArrayList<String> textExtensions;

  public FileExtensions()
  {
      addSourceExtensions();
      addTextExtensions();
  }

  private void addSourceExtensions()
  {
      sourceExtensions.add(".java");
      sourceExtensions.add(".c");
      sourceExtensions.add(".cpp");
      sourceExtensions.add(".h");
  }

  private void addTextExtensions()
  {
      textExtensions.add(".txt");
      textExtensions.add(".md");
  }

  public String getTextExtensions(int i)
  {
      return textExtensions.get(i);
  }

  public String getSourceExtensions(int i)
  {
      return sourceExtensions.get(i);
  }

  public int getTextExtensionsSize()
  {
      return textExtensions.size();
  }

  public int getSourceExtensionsSize()
  {
      return sourceExtensions.size();
  }
}
