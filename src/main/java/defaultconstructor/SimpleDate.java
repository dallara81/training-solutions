package defaultconstructor;
// Konstruktorok és inicializátorok
// Default és paraméter nélküli konstruktor

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    private static final int MONTH_LENGTHS [] = {31,28,31,30,31,30,31,31,30,31,30,31};

    public void setDate(int year, int month, int day) {
        if (!isCorrect(year, month, day)) {
            throw new IllegalArgumentException(String.format("Egy vagy több megadott paraméter nem elfogadható! %d, %d, %d",year, month, day ));
        }

        this.day = day;
        this.month = month;
        this.year = year;

    }

    private boolean isCorrect(int year, int month, int day) {
        boolean isCorrect = true;
        if (year < 1900) {
            isCorrect = false;

        }

        if (month < 1 || month > 12 ) {
            isCorrect = false;

        }
        else {

            if (day < 1 || day > calculateMonthLength(year, month)) {
                isCorrect = false;

            }
        }
        return isCorrect;
    }

    private boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeap = year % 400 == 0 ? true : false;
            }
            else {
                isLeap = true;
            }
        }
        return isLeap;
    }

    private int calculateMonthLength(int year, int month) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return MONTH_LENGTHS[month - 1];

    }

    public int getYear() {
        return year;

    }

    public int getMonth() {
        return month;

    }

    public int getDay() {
        return day;

    }
}