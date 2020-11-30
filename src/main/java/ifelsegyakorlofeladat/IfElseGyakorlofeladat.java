package ifelsegyakorlofeladat;

// If/else gyakorlófeladat Petinek

public class IfElseGyakorlofeladat {

    public static void main(String[] args) {

        // Ellenőrizendő szám;
        int number = 1;

        // Ellenőrzés, ha a szám nagyobb, mint 0
        if (number > 0) {
            System.out.println("A szám pozitív!");
        }
        // ellenőrzés, ha a szám kisebb, mint 0

        else if (number < 0) {
            System.out.println("A szám negatív!");
        }

        // Ha egyik helyzet sem áll fen
        else {
            System.out.println("Nulla! - se nem negatív, se nem pozitív");
        }
    }
}
