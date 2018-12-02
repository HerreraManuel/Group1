package Metrics;

import java.util.ArrayList;
import java.util.Arrays;

public class SourceLine {

    public int sourceLine(String fileContent){
        ArrayList<String> lines;
        lines = new ArrayList<String>(Arrays.asList(fileContent.split("\n")));
        int sloc = 0, cloc = 0, bloc = 0;
        String singleLine = "";
        for (int i = 0; i < lines.size(); i++){
            singleLine = lines.get(i);
            if (singleLine.equals("") || singleLine.equals("{") || singleLine.equals("}")){ bloc++; }
        }
        return 0;
    }

}