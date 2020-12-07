package defaultconstructor.date;
// Konstruktorok és inicializátorok
// Default és paraméter nélküli konstruktor

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimpleDateTest {

    @Test
    public void incorrectParameterShouldThrowExceptionNotALeapYear() throws IllegalArgumentException {
        SimpleDate sd = new SimpleDate();

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            sd.setDate(1901, 9, 11);
        });

        assertEquals("Egy vagy több megadott paraméter nem elfogadható! 1901, 9, 11", ex.getMessage());
    }

    @Test
    public void incorrectParameterShouldThrowExceptionDayIncorrect() throws IllegalArgumentException {
        SimpleDate sd = new SimpleDate();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            sd.setDate(2010, 4, 1);
        });

        assertEquals("Egy vagy több megadott paraméter nem elfogadható! 2010, 4, 1", ex.getMessage());
    }

    @Test
    public void incorrectParameterShouldThrowExceptionYearIncorrect() throws IllegalArgumentException {
        SimpleDate sd = new SimpleDate();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            sd.setDate(1490, 9, 1);
        });

        assertEquals("Egy vagy több megadott paraméter nem elfogadható! 1490, 9, 1", ex.getMessage());
    }

    @Test
    public void incorrectParameterShouldThrowExceptionMonthIncorrect() throws IllegalArgumentException {
        SimpleDate sd = new SimpleDate();

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            sd.setDate(2021, 4, 1);
        });

        assertEquals("Egy vagy több megadott paraméter nem elfogadható! 2021, 4, 1", ex.getMessage());
    }

    @Test
    public void incorrectParameterShouldThrowExceptionMonthIncorrect() throws IllegalArgumentException {
        SimpleDate sd = new SimpleDate();

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            sd.setDate(1000, 1, 1);
        });

        assertEquals("Egy vagy több megadott paraméter nem elfogadható! 1000, 1, 1", ex.getMessage());
    }

    @Test
    public void incorrectParameterShouldThrowExceptionMonthIncorrect() throws IllegalArgumentException {
        SimpleDate sd = new SimpleDate();

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            sd.setDate(2005, 7, 12);
        });

        assertEquals("Egy vagy több megadott paraméter nem elfogadható! 2005, 7, 12", ex.getMessage());
    }


    @Test
    public void testSetDate() {
        SimpleDate date = new SimpleDate();
        date.setDate(2001, 9, 11);
        assertEquals(2001, date.getYear());
        assertEquals(9, date.getMonth());
        assertEquals(11, date.getDay());
    }
}