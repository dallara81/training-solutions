package week11d03;

import java.util.List;
import java.util.ArrayList;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {
        if(words == null || words.size() < 1 || String.valueOf(c) == ""){
            throw new IllegalArgumentException("Érvénytelen adat!");
        }
        List<String> result = new ArrayList<>();
        String filter = String.valueOf(c);
        for (String word : words) {
            if (word.contains(filter)) {
                result.add(word);
            }
        }
        return result;
    }
}