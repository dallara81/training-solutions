package stringtype.registration;
// Registration osztály, a main() metódusban kérjük be az adatokat

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a felhasználónevet (megadása kötelező)! > ");
        String username = scanner.nextLine();

        System.out.println("Írd be a jelszót! Legalább 8 karakter legyen! >");
        String password = scanner.nextLine();

        System.out.println("Írd be a jelszót még egyszer! > ");
        String password2 = scanner.nextLine();

        System.out.println("Add meg az e-mail címet! Csak valós címet fogadunk el.");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        //  Írd ki a felhasználónak egyenként, hogy a megadott adat helyes vagy helytelen!
        System.out.println(userValidator.isValidUsername(username) ? "A megadott felhasználónév helyes!" : "A megadott felhasználónév helytelen!");
        System.out.println(userValidator.isValidPassword(password, password2) ? "A megadott elszó helyes!" : "A megadott jelszó helytelen!");
        System.out.println(userValidator.isValidEmail(email) ? "A megadott e-mail cím helyes!" : "A megadott e-mail cím helytelen!");

    }

}
