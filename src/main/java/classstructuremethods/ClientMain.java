package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        // Fejléc
        System.out.println("Lakcímváltó Béla v0.1 pre-alpha");
        System.out.println("(c) 1141 Budavári kőszoftverház");
        System.out.println(" ");


        // Jelenlegi cím
        client.setName("II. Béla");
        client.setYear(1108);
        client.setAddress("1011 Budapest, Vár utca 1.");

        // Kíratás
        System.out.println("Név > " + client.getName());
        System.out.println("Születési év > " + client.getYear());
        System.out.println("Cím > " + client.getAddress());


        // Költözés
        client.migrate("8000 Székesfehérvár, Arany János utca 9. ");

        // Változtatás eredményének kiírása
        System.out.println("Új cím > " + client.getAddress());
    }

}
