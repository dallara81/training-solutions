package gyakorlodisplaycurrentdate;

import java.time.LocalTime; // import the LocalTime class

public class DisplayCurrentDate {

    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
    }
}