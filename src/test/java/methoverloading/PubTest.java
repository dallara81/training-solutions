package methoverloading;
// Overloading - in the pub!

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PubTest {

    @Test
    public void constructorTest() {

        Pub pub = new Pub("Bar Correro", 25, 30);

        assertEquals("Bar Correro", pub.getName());
        assertEquals(10, pub.getOpenFrom().getHours());
        assertEquals(30, pub.getOpenFrom().getMinutes());

    }

    @Test
    public void toStringTest() {
        //Given
        Pub pub = new Pub("Bar Correro", 25, 30);
        //Then
        assertEquals("Bar Correro;25:30", pub.toString());

    }
}