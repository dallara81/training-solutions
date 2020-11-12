package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {

        // Fejléc
        System.out.println("Kézigránát-butik készletkezelő szoftver v0.1");
        System.out.println("(c) 2020 Durr-Bele Bt.");
        System.out.println(" ");

        // Kezdő készlet
        Store no69Store = new Store("No. 69 kézigránát");
        no69Store.store(364);
        System.out.println(no69Store.getProduct() + ": " + no69Store.getStock());

        Store no77Store = new Store("No. 77 kézigránát");
        no77Store.store(147);
        System.out.println(no77Store.getProduct() + ": " + no77Store.getStock());

        // Kiszállítás rutin
        no69Store.dispatch(41);
        no77Store.dispatch(67);

        // Beszállítás rutin
        no69Store.store(250);
        no77Store.store(250);

        // Készlet kiszámítása rutin
        System.out.println(no69Store.getProduct() + ": " + no69Store.getStock());
        System.out.println(no77Store.getProduct() + ": " + no77Store.getStock());
    }

}
