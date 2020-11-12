package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {

        System.out.println("Literálok és típusok gyakorlófeladat v0.1");

        // b nevű, bolean típusú változó definiálása,
        // értékadás > false
        boolean b = false;

        // sout (b)
        System.out.println(b);

        // c néven, integer t., értéke 2
        int c = 2;

        // egy sorban kettőt, miért is ne...
        // integer t., i=3, j=4 értékkel
        int i = 3, j = 4;

        // integer típusú, k nevű változó definiálása, i értékével
        int k = i;

        // string típusú, s nevű változó "Hello World" értékkel
        String s = "Hello World";

        String t = s;

        // metóduson belül definiált blokk
        // integer t. változó definiálása, x néven, 0 kezdőértékkel
        {
            int x = 0;
            System.out.println(c);
        }
    }

}
