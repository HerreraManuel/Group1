package Metrics;

public class Metrics_TestMain
{
    public static void main(String[] args)
    {
        Metrics_TestMain instance = new Metrics_TestMain();
        instance.run(args);
    }

    public void run(String[] args)
    {
        String fileContent = "#include <stdio.h>\nint main()\n{\n  printf(\"Hello World!\\n\");\n  return 0;\n}";
        Lines lines = new Lines();
        Words words = new Words();
        Characters chars = new Characters();
        CommentLine commentLine = new CommentLine();

        System.out.println(fileContent);
        System.out.println("\n\n");
        System.out.println("Line Count: " + lines.lineCount(fileContent));
        System.out.println("Word Count: " + words.wordCount(fileContent));
        System.out.println("Char Count: " + chars.characterCount(fileContent));
        System.out.println("Cmmt Count: " + commentLine.commentLine(fileContent));
    }
}
