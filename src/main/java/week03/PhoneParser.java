package week03;

public class PhoneParser {

    public static void main(String[] args) {

        Phone phone = new Phone("30-6666666");
        System.out.println(phone.getPrefix());
        System.out.println(phone.getNumber());

    }
}