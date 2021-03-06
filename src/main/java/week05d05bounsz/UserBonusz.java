package week05d05bounsz;

// Lista programozó e-mail ellenőrzője :)

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.validator.routines.EmailValidator;

public class UserBonusz {

    public static boolean isValidEmail(String email) {

        // Email Validator
        EmailValidator validator = EmailValidator.getInstance();

        // Ellenőrzés. Ennyi :) Elegáns, nem?
        return validator.isValid(email);
    }

    public static void main(String[] args) {
        List<String> emails = new ArrayList<String>();

        // Nézzük meg néhány szintaktikailag helyes e-mail-címre;
        emails.add("istvan.kovacs@sil.space");
        emails.add("istvan.kovacs@dam.hu");
        emails.add("maria34234@hotmail.com");

        // Nézzünk néhány helytelent;
        emails.add("istvan.sil.space");
        emails.add("istvan..kovacs@sil.space");
        emails.add("maria34234@.hotmail.com");

        for (String value : emails) {
            System.out.println("Az e-mail cím " + value + (isValidEmail(value) ? "érvényes" : "érvénytelen"));
        }
    }
}
