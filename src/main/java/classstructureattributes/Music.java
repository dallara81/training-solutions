package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("SpotiSpy Phishing Service v0.1 alpha");
        System.out.println(" ");
        System.out.println("Kérlek, add meg a kedvenc zeneszámod adatait!");
        System.out.println("Jó lesz, ne félj. Bennünk megbízhatsz.");
        System.out.println(" ");

        // Előadó beviteli mező
        System.out.println("Melyik a kedvenc előadód? > ");
        song.band = scanner.nextLine();

        // Szám címe beviteli mező
        System.out.println("Melyik a kedvenc számod ettől az előadótól? > ");
        song.title = scanner.nextLine();

        // Hossz beviteli mező
        System.out.println("Milyen hosszú a szám, percben megadca? > ");
        song.length = scanner.nextInt();

        // konkatenálás OBS! Típusok! > Jegyzetbe megjelölni
        System.out.println(song.band + " - " + song.title + " (" + song.length + "perc)");

    }
}
