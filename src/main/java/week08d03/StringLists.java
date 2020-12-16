package week08d03;
// Készíts week08d03 csomagban egy StringLists osztályt és benne egy stringListsUnion(List<String> first,
// List<String> second) metódust, mely két string listát vár paraméterül és visszaadja az uniójukat.
// Az úniónak minden elemet tartalmaznia kell mindkét listából, de egy elem nem szerepelhet kétszer!

import java.util.List;
import java.util.ArrayList;

public class StringLists {

    public List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> unio = new ArrayList<>();

        for (String s : first) {
            unio.add(s);
        }
        for (String s : second) {
            if (!unio.contains(s)) {
                unio.add(s);
            }
        }
        return unio;
    }
}
