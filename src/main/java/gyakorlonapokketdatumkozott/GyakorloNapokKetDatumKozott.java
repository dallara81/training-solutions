package gyakorlonapokketdatumkozott;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class GyakorloNapokKetDatumKozott {

    public static void main(String[] args) {

        LocalDate dateBefore = LocalDate.of(2020, Month.OCTOBER, 26);
        LocalDate dateAfter = LocalDate.of(2021, Month.MARCH, 16);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        System.out.println(noOfDaysBetween);
    }
}
