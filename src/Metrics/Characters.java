package Metrics;
import com.sun.javafx.font.Metrics;

import java.io.*;

public class Characters {

    public int characterCount(String fileContent) {
        int chars = 0;
        try {
            if (fileContent.isEmpty()) throw new MetricsException();
            chars = fileContent.length();
            return chars + 1;
        } catch(MetricsException e) {

        }
        return chars + 1;
    }

}