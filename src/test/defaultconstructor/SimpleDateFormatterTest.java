package defaultconstructor;
// Konstruktorok és inicializátorok
// Default és paraméter nélküli konstruktor

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleDateFormatterTest {

    private SimpleDate simpleDate;

    @BeforeEach
    public void setUp() {
        simpleDate = new SimpleDate();
        simpleDate.setDate(2001, 9, 11);
    }

    @AfterEach
    public void tearDown() {
        simpleDate = null;
    }

    @Test
    public void testFormatDateStringByCountryCodeHU() {

        assertEquals("2001-9-11", new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.HU, simpleDate));
    }

    @Test
    public void testFormatDateStringByCountryCodeEN() {

        assertEquals("11-9-2001", new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.EN, simpleDate));
    }

    @Test
    public void testFormatDateStringByCountryCodeUS() {

        assertEquals("9-11-2001", new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.US, simpleDate));
    }

    @Test
    public void testFormatDateString() {

        assertEquals("2001-9-11", new SimpleDateFormatter().formatDateString(simpleDate));
    }
}