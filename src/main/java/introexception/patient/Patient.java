package introexception.patient;
// Beki - Be-Ki - Bevezetés a kivételkezelésbe

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Kötelező megadani a nevet!");
        }
        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("Születési év bevitele csak 1900-tól lehetséges!");
        }
        if (!new SsnValidator().isValidSsn(socialSecurityNumber)) {
            throw new IllegalArgumentException("Helytelen TAJ-szám!");
        }

        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;

    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}