package week05d03;

import java.util.List;
import java.util.ArrayList;

public class ListCounter {

    List<String> list = new ArrayList<>();

    public int count(List<String> list) {
        int i = 0;
        for (String s : list) {
            if (s.startsWith("A") || s.startsWith("a")) {
                i = i + 1;
            }
        }
        return i;
    }
}