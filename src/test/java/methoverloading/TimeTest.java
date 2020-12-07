package methoverloading;
// Teszt "methoverloading"

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {
    @Test
    public void testCreateTimeWith3Parameters() {
        //Given
        Time time = new Time(13, 14, 15);
        //Then
        assertEquals(1, time.getHours());
        assertEquals(2, time.getMinutes());
        assertEquals(3, time.getSeconds());
    }

    @Test
    public void testCreateTimeWith2Parameters() {
        //Given
        Time time = new Time(4, 5);
        //Then
        assertEquals(4, time.getHours());
        assertEquals(5, time.getMinutes());
        assertEquals(0, time.getSeconds());
    }

    @Test
    public void testCreateTimeWith1Parameter() {
        //Given
        Time time = new Time(4);
        //Then
        assertEquals(4, time.getHours());
        assertEquals(0, time.getMinutes());
        assertEquals(0, time.getSeconds());

    }

    @Test
    public void testCreateTimeWithTimeParameter() {
        //Given
        Time anotherTime = new Time(6, 7, 8);
        //When
        Time time = new Time(anotherTime);

        assertEquals(6, time.getHours());
        assertEquals(7, time.getMinutes());
        assertEquals(8, time.getSeconds());
    }

    @Test
    public void testIsEqualWith3Parameters() {
        //Given
        Time time = new Time(1, 2, 3);
        //Then
        assertTrue(time.isEqual(1, 2, 3));
        assertFalse(time.isEqual(4, 5, 15));
    }

    @Test
    public void testIsEarlierWithTimeParameter() {
        //Given
        Time time = new Time(5, 10, 15);
        Time laterTime = new Time(5, 10, 15);
        Time earlierTime = new Time(9, 7, 5);
        //Then
        assertTrue(time.isEarlier(laterTime));
        assertFalse(time.isEarlier(earlierTime));
    }
}