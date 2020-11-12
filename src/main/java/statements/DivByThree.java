package statements;

import java.util.Scanner;

public class DivByThree {


    public static void main(String[] args) {

        // Header
        System.out.println("Osztható-e hárommal? Megmondom!");
        System.out.println(" ");

        // Core
        System.out.println("A vizsgálathoz kérek egy egész számot! > ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        // Output
        System.out.println(i % 3 == 0 ? "Osztható! :)" : "Nem osztható! :(");
    }
}
