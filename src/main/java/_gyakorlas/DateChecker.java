package _gyakorlas;

import java.util.*;
import java.time.*;

    public class DateChecker {

        public static void main(String[] args)
        {
            // Első dátum
            LocalDate dt1 = LocalDate.parse("2021-01-21");
            // Második dátum
            LocalDate dt2 = LocalDate.parse("2020-11-26");

            // Ellenőrzés
            System.out.println(dt1.isBefore(dt2));
        }
}
