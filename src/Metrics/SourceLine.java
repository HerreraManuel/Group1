package Metrics;

import java.util.ArrayList;
import java.util.Arrays;

public class SourceLine {

    public int sourceLine(String fileContent){
        ArrayList<String> lines;
        lines = new ArrayList<String>(Arrays.asList(fileContent.split("\n")));
        int sloc = 0, cloc = 0, bloc = 0;
        return 0;
    }

}