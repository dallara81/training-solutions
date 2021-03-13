package gyakorlasalapok04;

public class GyakorloGetterSetterObjectJQV {

    public static void main(String[] args) {
        GyakorloGetterSetterJQV first = new GyakorloGetterSetterJQV();
        GyakorloGetterSetterJQV second = new GyakorloGetterSetterJQV();
        GyakorloGetterSetterJQV third = new GyakorloGetterSetterJQV();

        first.setName("Géza");
        second.setName("Ubul");
        third.setName("Lajos");

        System.out.println(first.getName());
        System.out.println(second.getName());
        System.out.println(third.getName());
    }

}