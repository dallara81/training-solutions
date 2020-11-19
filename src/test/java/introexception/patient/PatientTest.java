package introexception.patient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PatientTest {


    @Test
    public void invalidSsn() {
        assertThrows(IllegalArgumentException.class, () -> new Patient("Mimóza Géza", "abc", 2000));
    }

    @Test
    public void validSsn() {
        Patient patient = new Patient("Mimóza Géza", "123456788", 2000);
        assertEquals("Mimóza Géza", patient.getName());
        assertEquals("123456788", patient.getSocialSecurityNumber());
        assertEquals(2000, patient.getYearOfBirth());
    }
}