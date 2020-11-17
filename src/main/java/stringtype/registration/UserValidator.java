package stringtype.registration;
// Regisztrációs adatok vizsgálata

public class UserValidator {

    // felhasználónevet
    public boolean isValidUsername(String username) {
        return !"".equals(username);
    }

    // a jelszót kétszer
    public boolean isValidPassword(String password1, String password2) {

        // A jelszó legalább 8 karakter hosszú kell legyen
        return password1.length() >= 8

                // és a két megadott jelszónak egyeznie kell
                && password1.equals(password2);

    }

    // Az email címben kell lennie @ karakternek
    // és valamikor utána (de nem közvetlenül) pontnak.
    // A @ karakter nem lehet az első, az őt követő pont pedig az utolsó.
    public boolean isValidEmail(String email) {
        int atSignIndex = email.indexOf('@');
        String domain = email.substring(atSignIndex + 1);
        int dotInDomainIndex = domain.indexOf('.');
        return atSignIndex > 0
                && dotInDomainIndex > 0
                && dotInDomainIndex < domain.length() - 1;

    }

}
