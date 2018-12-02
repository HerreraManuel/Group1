package Metrics;


public class CommentLine{

    public int commentLine(String fileContent) {
        int commentLine = 0;
        String[] lineKeeper;
        lineKeeper = fileContent.split(("\\r?\\n"));
        for(String singleLine : lineKeeper){

        }
        return commentLine;
    }

    public boolean commentBegan(String line){

        return false;
    }

    public boolean commentEnded(String line){
        return false;
    }


}



// Parambir's Code Below
/*
public void commentCount() // goes line by line for comments indication
    {
        try {
            FileReader file = new FileReader(filename);
            BufferedReader buffer = new BufferedReader(file);
            String line = buffer.readLine();

            //Source:https://stackoverflow.com/questions/1657066/java-regular-expression-finding-comments-in-code
       //     Pattern pattern1 = Pattern.compile("(?s)/\\*.*?\\*///");

       // Pattern pattern2 = Pattern.compile("(//.*?$)|(/\\*.*?\\*/)", Pattern.MULTILINE | Pattern.DOTALL);
/*
        while (line!= null) {
        Matcher m = pattern1.matcher(line);

        Matcher m2 = pattern2.matcher(line);

     //   if (line.contains("/*") && line.contains("*///")) {
/*
        line = buffer.readLine();
        comments++;
        }

     //   else if (line.contains("/*")) {      // To read multi-lines
        comments++;

        //  while (!line.contains("*///")) {
/*
        comments++;

     //   if (line.contains("*/
/*
        comments++;
        }
        line = buffer.readLine();
        }
        }
        else {
        while (m.find()) {       // single lines
        comments++;
        }
        while (m2.find()) {
        comments++;
        }
        }
        line = buffer.readLine();
        }
        commentTotal+=comments;

        }catch (IOException e) {
        System.out.println("Unable to open file");
        }
        }
*/