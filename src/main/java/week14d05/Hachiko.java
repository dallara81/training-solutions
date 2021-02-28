package week14d05;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Hachiko {

    public Map<String, Integer> countWords(String fileName, String... strings) {
        Map<String, Integer> result = new HashMap<>();
        prepareMap(result, strings);
        try (InputStream is = Hachiko.class.getResourceAsStream(fileName);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                mapGenerator(result, line, strings);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Where is the fucking file? Btw, not here!", ioe);
        }
        return result;
    }

    private void prepareMap(Map<String, Integer> result, String[] strings) {
        for (String str : strings) {
            result.put(str, 0);
        }
    }

    private void mapGenerator(Map<String, Integer> result, String line, String[] strings) {
        for (String str : strings) {
            if (line.contains(str)) {
                result.replace(str, result.get(str) + 1);
            }
        }
    }
}