package gyakorloforeach2;

import java.util.List;
import java.util.ArrayList;

public class GyakorloForEach2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Mária");
        names.add("Marianna");
        names.add("Anna");
        names.add("Margó");
        names.add("Szilvia");

        System.out.println("M-betűs nevek különböző sorrend szerint\n");

        // forEach - M-betűs nevek ABC-sorrend-ben
        System.out.println("Sorrend forEach-hel");
        names.stream()
                .filter(f->f.startsWith("M"))
                .parallel()
                .forEach(n->System.out.println(n));

        System.out.println(" ");

        // forEachOrdered - M-betűs nevek az eredeti listás sorrendben
        System.out.println("Sorrend forEachOrdered-del");
        names.stream()
                .filter(f->f.startsWith("M"))
                .parallel()
                .forEachOrdered(n->System.out.println(n));

    }
}