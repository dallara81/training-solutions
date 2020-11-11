package classstructureattributes;

import java.util.Scanner;
// import-scanner, because we have no domestic product.
// The Japanese is the best, but it is subjective.
// It's made in China anyway.
// Make Hungary Great Again!
// WTF!? We never made scanners.
// Let's go on! The point is to understand what it means.

public class ClientMain {
    // Male client, I just typed...

    public static void main(String[] args) {
        // Boredom. What should we write about this?

        Scanner scanner= new Scanner(System.in);
        // Well yeah! Scanner again. I see.

        Client client = new Client();
        // New client. Again. This is one of those days.
        // Sometimes there is no one.


        // Header-block
        System.out.println("Clients of Lulu White v0.1 alpha");
        System.out.println(" @2020 Red Light House Software");
        System.out.println(" ");
        // Header-end

        // Névmegadás beviteli mező
        System.out.println("Kérlek, add meg a neved! > ");
        client.name = scanner.nextLine();

        // Születési év beviteli mező
        System.out.println("Kérlek, add meg a születési évedet! > ");
        client.year = scanner.nextInt();

        // Lakcím beviteli mező
        client.address = scanner.nextLine();
        System.out.println("Kérlek, add meg a lakcímedet! > ");
        client.address = scanner.nextLine();

        // Kiíratás mező
        System.out.println("Kliens neve > " + client.name);
        System.out.println("Kliens születési éve > " + client.year);
        System.out.println("Kliens címe > " + client.address);
        }

}
