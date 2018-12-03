package Metrics;
import com.sun.javafx.font.Metrics;

import java.io.*;

public class Characters {

    public int characterCount(String fileContent) {
            int chars = 0;
            chars = fileContent.length();
            return chars + 1;
    }

}