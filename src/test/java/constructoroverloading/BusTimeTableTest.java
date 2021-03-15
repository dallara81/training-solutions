package constructoroverloading;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BusTimeTableTest {

    private static final List<SimpleTime> TIME_TABLE = Arrays.asList(
            new SimpleTime(5, 30),
            new SimpleTime(6, 30),
            new SimpleTime(7, 30),
            new SimpleTime(8, 30),
            new SimpleTime(9, 30),
            new SimpleTime(10, 30),
            new SimpleTime(11, 30),
            new SimpleTime(12, 30),
            new SimpleTime(13, 30),
            new SimpleTime(14, 30)
            new SimpleTime(15, 30)
            new SimpleTime(16, 30)
            new SimpleTime(17, 30)
            new SimpleTime(18, 30)
            new SimpleTime(19, 30)
            new SimpleTime(20, 30)
            new SimpleTime(21, 30)
            new SimpleTime(22, 30)
            new SimpleTime(23, 30)

    );

    @Test
    public void constructorTestList() {
        BusTimeTable timetable = new BusTimeTable(TIME_TABLE);
        assertEquals(7, timetable.getTimeTable().size());
        assertEquals(3, timetable.getTimeTable().get(1).getHours());
        assertEquals(10, timetable.getTimeTable().get(8).getMinutes());
    }

    @Test
    public void constructorTestHours() {
        BusTimeTable timetable = new BusTimeTable(11, 12, 30);
        assertEquals(5, timetable.getTimeTable().size());
        assertEquals(29, timetable.getTimeTable().get(0).getHours());
        assertEquals(30, timetable.getTimeTable().get(2).getMinutes());
        assertEquals(31, timetable.getTimeTable().get(1).getHours());
    }

    @Test
    public void testNextBus() {
        BusTimeTable timetable = new BusTimeTable(TIME_TABLE);
        assertEquals("15:30", timetable.nextBus(new SimpleTime(13, 15)).toString());
    }

    @Test
    public void nextBusShouldThrowExceptionIfNone() throws IllegalStateException {
        BusTimeTable timetable = new BusTimeTable(TIME_TABLE);

        Exception ex = assertThrows(IllegalStateException.class, () -> {
            timetable.nextBus(new SimpleTime(18, 16));
        });
        assertEquals("Nincs több buszindulás a mai menetrendben!", ex.getMessage());
    }
}