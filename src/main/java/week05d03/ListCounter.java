package week05d03;

import java.util.List;
import java.util.ArrayList;

public class ListCounter {

    public int count(List<String> list) {
        int i = 0;
        for (String s : list) {
            if (s.startsWith("A") || s.startsWith("a")) {
                i = i++;
            }
        }
        return i;
    }
}