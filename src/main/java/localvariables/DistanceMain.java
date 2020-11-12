package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        System.out.println("Maratoni Távolságellenőrző v0.1");

        // Maraton vagy majdnem-maraton?
        Distance distance = new Distance(42.195, false);

        // Egész szám rutin
        System.out.println(distance.getDistanceInKm() + " " + distance.isExact());
        int integerPart = (int) distance.getDistanceInKm();

        // Eredmény
        System.out.println(integerPart);

    }

}
