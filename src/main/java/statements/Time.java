// Időpontok
package statements;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // getInMinutes
    public int getInMinutes() {
        int hourInMinutes = 60;
        return hours * hourInMinutes + minutes;
    }

    // getInSeconds
    public int getInSeconds() {
        int minuteInSeconds = 60;
        return getInMinutes() * minuteInSeconds + seconds;
    }

    // earlierThan
    public boolean earlierThan(Time other) {
        int thisTimeInSeconds = this.getInSeconds();
        int otherTimeInSeconds = other.getInSeconds();
        return thisTimeInSeconds < otherTimeInSeconds;
    }

    // toString
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }

}
