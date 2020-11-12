// Kifejezések
package statements;

public class StatementMain {

    public static void main(String[] args) {


        // int típusú x változó, értéke az 5 és 6 literál összege
        int x = 5 + 6;

        // int típusú y változó, mely a 11 literálból kivont x változó értékét kapja
        int y = 11 - x;

        // int típusú z változó, értéke 8
        int z = 8;

        // boolean típusú b változó definiálása,
        // értéke true, ha az x értéke nagyobb, mint az y változó értéke.
        boolean b = x > y;

        // boolean típusú c változó,
        // értéke true, ha a b értéke true, vagy z értéke nagyobb, mint 5.
        boolean c = b || (z > 5);

        z++;


    }

}
