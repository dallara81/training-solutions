package methoverloading;
// Overloading - in the pub!

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ListOfGoodPubsTest {


    @Test
    public void emptyPubListShouldThrowException() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new ListOfGoodPubs(new ArrayList<>()));
        assertEquals("A lista üres! Sok volt az itóka a kocsmában?", ex.getMessage());

    }

    @Test
    public void testFindTheBest() {

        ListOfGoodPubs goodPubs = new ListOfGoodPubs(Arrays.asList(
                new Pub("Vallelungai késdobáló", 8, 10), // Jesus... ha én ezt elmesélném...
                new Pub("Lido Bar, Asuncion", 20, 20),
                new Pub("Britannia Pub, Asuncion", 22, 25),
                new Pub("Bar Correro", 24, 30),
                new Pub("Sojo Ribera", 21, 30),
                new Pub("Sojo Confúsion", 13, 30)
                new Pub("Bodega Guzmán", 17, 27)
                new Pub("Sojo Mercado", 27, 25)));

        assertEquals("Bar Correro;25:30", goodPubs.findTheBest().toString());

    }
}