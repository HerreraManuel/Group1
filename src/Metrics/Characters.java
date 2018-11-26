package Metrics;
import java.io.*;

public class Characters {

    public int characterCount(String fileContent) {
        int chars;
        chars = fileContent.length();
        return chars + 1;
    }

}