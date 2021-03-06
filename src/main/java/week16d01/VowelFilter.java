package week16d01;

import java.io.BufferedReader;
import java.io.IOException;

public class VowelFilter {

    private static final String HUNGARIAN_VOWELS = "AÁEÉIÍOÓÖŐUÚÜŰaáeéiíoóöőuúüű";

    public String filterVowels(BufferedReader reader) {
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            while (((line = reader.readLine()) != null)) {
                processLine(sb, line);
            }
            return sb.toString();
        } catch (IOException ioe) {
            throw new IllegalStateException("You fucked up it!", ioe);
        }
    }

    private void processLine(StringBuilder sb, String line) {
        for (Character c : line.toCharArray()) {
            if (!HUNGARIAN_VOWELS.contains(c.toString())) {
                sb.append(c);
            }
        }
        sb.append("\n");
    }
}