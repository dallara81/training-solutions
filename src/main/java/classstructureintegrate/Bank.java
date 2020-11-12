package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Puskáztam, sorry - így éjjel 2:45-kor már a feladat sem könnyen értelmezhető
        // ...de hát csinálni kell... mert ez a lényeg!

        System.out.println("Adja meg az új számla számát! > ");
        String accountNumber = scanner.nextLine();

        System.out.println("Adja meg a számlatulajdonos nevét! >");
        String owner = scanner.nextLine();

        System.out.println("Adja meg a nyitóösszeget > ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        BankAccount account1 = new BankAccount(accountNumber, owner, amount);

        System.out.println("Adja meg az új számla számát! > ");
        String accountNumber2 = scanner.nextLine();

        System.out.println("Adja meg a számlatulajdonos nevét! >");
        String owner2 = scanner.nextLine();

        System.out.println("Adja meg a nyitóösszeget > ");
        int amount2 = scanner.nextInt();

        BankAccount account2 = new BankAccount(accountNumber2, owner2, amount2);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

        System.out.println("Befizetés pénzösszege (1. számla) > ");
        int depositAmount = scanner.nextInt();
        account1.deposit(depositAmount);

        System.out.println(account1.getInfo());

        System.out.println("Befizetés pénzösszege (2. számla) > ");
        int withdrawAmount = scanner.nextInt();
        account2.withdraw(withdrawAmount);

        System.out.println(account2.getInfo());

        System.out.println("Mekkora összeget utalna az 1. számláról a 2. számlára?");
        int transferAmount = scanner.nextInt();
        account1.transfer(account2, transferAmount);

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());
    }
}
