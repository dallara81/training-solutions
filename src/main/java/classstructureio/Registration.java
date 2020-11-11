package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        System.out.println("Gates-Spy-Gate Regisztrációs Felület v0.1 alpha");
        // Kírjuk a program(-trace) nevét. Jó ha van neki, és informatív.

        System.out.println("Kérlek, add meg adataidat a regisztrációhoz!");
        // Jáá, akármennyire is nehezünkre esik, legyünk jófejek, kedvesek - kivételesen.
        // Így könnyebben a bizalmába férkőzünk, hogy aztán kiadja a féltett adatait :)

        Scanner scanner = new Scanner(System.in);
        // Mégis csak lapolvasó lesz ez! A szeknner az szkenner, or not?

        System.out.println("Első lépésként kérlek, add meg a neved! > ");
        // Munkára fel! Kérjük be a top-userünktől a nevét!

        String nev = scanner.nextLine();
        // nextLine metódus meghívása, hogy be tudja írni a user a nevét.

        System.out.println("Kérlek, add meg az e-mail címed! > ");
        // Lássuk, van-e e-mail címe ennek a digitális analfabétának!?

        String mail = scanner.nextLine();
        // Ha ide beír valamit, akkor sanoszos, hogy van neki. Vagy beparázott, és máshogy nem tud továbblépni.
        // Mondjuk jó lenne lecskkolni, hogy szintaktikailag e-mail cím-e az, amit beírt?
        // Létezik-e a domain? És ha létezik, meg is lehetne pingelni - bizos, ami biztos alapon.
        // Vagy legalább azt, hogy van-e benne kukac. Na mind1... ne lihegjük túl!
        // A kutyának sem hiányzik, hogy strébernek nézzék.


        System.out.println("Az alábbi adatokkal regisztráltál: ");
        // Eredmény fejléce
        System.out.println("   Név: " + nev);
        // Név kiíratása
        System.out.println("   e-mail cím: " + mail);
        // e-mail cím kiíratása
    }

}
