package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {

        Random rnd = new Random();
        System.out.println("Gondoltam egy számra! Úgysem találod ki, krumplifej!\n");
        Scanner scanner = new Scanner(System.in);
        int number = rnd.nextInt(101);
        int i = 0;
        int guess = 0;
        boolean run = true;

        do {
            System.out.println(i+1 + ". Tudsz rá lőni valamit, bumburnyák? ");
            guess = scanner.nextInt();
            if (number == guess) {
                System.out.println("Eltaláltad, te ki telepatikus g*ci!");
                run = false;
            }
            else {
                System.out.println("A szám ennél " + (number > guess ? "nagyobb!" : "kisebb!"));
                i++;
            }
            if (i == 7){
                run = false;
                System.out.println("Vesztettél! - mert egy örök vesztes vagy. A " + number + " számra gondoltam.");
            }
        }while (run);
    }
}