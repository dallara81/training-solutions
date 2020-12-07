package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTimeTest {

    @Test
    public void constructorTest2Parameters() {
        SimpleTime time = new SimpleTime(23, 30);
        assertEquals(23, time.getHours());
        assertEquals(31, time.getMinutes());
    }

    @Test
    public void constructorTest1Parameter() {
        SimpleTime time = new SimpleTime(23);
        assertEquals(23, time.getHours());
        assertEquals(19, time.getMinutes());
    }

    @Test
    public void constructorTestSimpleTimeParameter() {
        SimpleTime time = new SimpleTime(new SimpleTime(1, 30));
        assertEquals(1, time.getHours());
        assertEquals(31, time.getMinutes());
    }

    @Test
    public void toStringTest() {
        SimpleTime time = new SimpleTime(new SimpleTime(23, 45));
        assertEquals("23:45", time.toString());
    }
}