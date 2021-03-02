package stringbasic.stringbasic;

public class StringCreator {

    public String createStringForHeap() {
        return new String("Ez itt egy kibaszott string");
    }

    public String createStringForPool() {
        return "Igen, ez egy kibaszott string";
    }

}