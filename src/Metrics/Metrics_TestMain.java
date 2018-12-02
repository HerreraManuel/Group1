package Metrics;

import com.sun.javafx.font.Metrics;

public class Metrics_TestMain
{
    public static void main(String[] args)
    {
        Metrics_TestMain instance = new Metrics_TestMain();
        instance.run(args);
    }

    public void run(String[] args){
        String fileContent = "#include <stdio.h>\n" +
                "// T1\n//T2\n" +
                "/* random stuff in here */\n" +
                "//Line Comment\n// Line Comment 2\n" +
                "int main()\n{\n  printf(\"Hello World!\\n\");\n  " +
                "printf() // System.out.println()\n /* Block comment\n" +
                "// invalid single comment\n" +
                "*/\n" +
                "// Testing line\n" +
                "return 0;\n}";
        Lines lines = new Lines();
        Words words = new Words();
        Characters chars = new Characters();
        CommentLine commentLine = new CommentLine();
        SourceLine sourceLine = new SourceLine();

        System.out.println(fileContent);
        System.out.println("\n\n");
        // MetricsException handling implementation
        try {
            if(fileContent.isEmpty()) throw new MetricsException();
            System.out.println("Line Count: " + lines.lineCount(fileContent));
            System.out.println("Word Count: " + words.wordCount(fileContent));
            System.out.println("Char Count: " + chars.characterCount(fileContent));
            System.out.println("Cmmt Count: " + commentLine.commentLine(fileContent));
            System.out.println("Src  Count: " + sourceLine.sourceLine(fileContent));
        } catch(MetricsException e) { System.out.println("String is null or empty."); }
    }
}
