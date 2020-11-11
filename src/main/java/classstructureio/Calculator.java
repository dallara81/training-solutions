package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Beolvasás konzolról. A látszat ellenére ez nem egy lapolvasó!

        System.out.println("Loopy Poopy Potty Integer Calculator v0.1 alpha");
        // Adjunk ennek a fisi-f*snak valami értékelhető nevet!

        System.out.println("Kérlek, ne tolj ki velem! Törtszámokkal nem dolgozom.");
        System.out.println("Még valami: csak 2147483647 összegig számolok helyesen.");
        // looser-user-nyekergés-nyavajgás-elhárító-figyelmeztetés

        System.out.println("Kérem az első egész számot! > ");
        int szam1 = scanner.nextInt();
        // Az első kib***tt egész szám bekérése

        System.out.println("Kérem a második egész számot! > : ");
        int szam2 = scanner.nextInt();
        // A második kib***tt egész szám bekérése

        System.out.println(szam1 + " + " + szam2);
        // ...hát így adunk össze, had lássa a szerencsétlen loopy-looser-user, hogy mit csinál ez a csodaszoftver
        System.out.println(szam1 + szam2);
        // írjuk ki az eredményt is, ennyit igazán megtehetünk még érte, ha már ezt a hulladékot használja.
    }
}
