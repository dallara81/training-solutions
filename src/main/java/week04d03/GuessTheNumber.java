package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Random rnd = new Random();

        int number = rnd.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        System.out.println("Tippelj egy számra 1 és 100 között! > " /*+ number*/);
        int i = 0;
        while (answer != number && i < 6) {
            answer = Integer.parseInt(scanner.nextLine());
            if (answer == number) {
                System.out.println("Sikerült, ügyes vagy Tompika!");
                break;
            } else if (answer > number) {
                System.out.println("Az általad megadott szám kissebb, tippelj újra! > ");
            } else if (answer < number) {
                System.out.println("Az általad megadott szám nagyobb, tippelj újra! > ");
            }
            i++;
        }
        if (answer != number) {
            System.out.println("Nincs több lehetőséged, a keresett szám a " + number + " volt. Ostoba vagy!");
        }
    }
}