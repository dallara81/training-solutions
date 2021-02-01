package week14d01;

import java.util.*;

public class Indexer {

    public Map<Character, List<String>> index(List<String> names){
        Map<Character, List<String>> result = new HashMap<>();
        for(String name: names){
            Character firstChar = name.charAt(0);
            if(result.containsKey(firstChar)){
                result.get(firstChar).add(name);
            } else {
                result.put(firstChar, new ArrayList<>(Arrays.asList(name)));
            }
        }
        return result;

    }
}