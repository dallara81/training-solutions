package introconstructors;
// Étterem

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Sarki Leveszabáló", 12);
        System.out.println("Kifőzde neve >");
        System.out.println(restaurant.getName());
        System.out.println(" ");
        System.out.println("Kapacitás >");
        System.out.println(restaurant.getCapacity());
        System.out.println(" ");
        System.out.println("Menü");
        System.out.println(restaurant.getMenu());
    }
}