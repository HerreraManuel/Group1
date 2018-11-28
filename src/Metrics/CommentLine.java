package Metrics;


public class CommentLine{

    public int commentLine(String fileContent) {
        int commentLine = 0;
        return commentLine;
    }

    public boolean commentBegan(String line){
        return false;
    }

    public boolean commentEnded(String line){
        return false;
    }


}

// Matthews Code Below
/*
public class CommentLine {

    public void commentline(String fileContent){
        try{
            int commentCount = 0;
            Scanner bk = new Scanner(fileContent);
            String comment = "";
            Boolean commentChecker;
            while(bk.hasNextLine()){
                comment = bk.nextLine();
                for(int i = 0; i <= comment.length() - 1; i++){
                    char com =  comment.charAt(i);
                    if(i != comment.length() - 1){
                        char comNext =  comment.charAt(i + 1);
                        if(com == '/' && comNext == '/'){
                            commentCount++;
                        }

                        if(com == '/' && comNext == '*'){
                            commentCount++;
                            commentChecker = true;
                            while(commentChecker == true){
                                while(bk.hasNextLine()){
                                    if(commentChecker == false){
                                        break;
                                    }
                                    String innerComment = bk.nextLine();
                                    commentCount++;
                                    for(int j = 0; j <= innerComment.length() - 1; j++){
                                        char innerCom = innerComment.charAt(j);
                                        if(j != innerComment.length() - 1){
                                            char innerComNext = innerComment.charAt(j + 1);
                                            if(innerCom == '*' && innerComNext == '/'){
                                                commentChecker = false;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return commentCount;
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            return 0;
        }
    }
}
*/


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