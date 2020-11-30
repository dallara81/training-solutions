package week03;

public class Phone {
    private String prefix;
    private String number;

    public Phone(String phone) {

        this.prefix = phone.substring(0,6);
        this.number = phone.substring(3) ;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getNumber() {
        return number;
    }
}