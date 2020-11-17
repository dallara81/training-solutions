package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        // definiálj prefix néven egy String típusú változót, és add értékül a "Hello " literál értékét
        String prefix = "Hello ";

        // Definiálj name néven egy String típusú változót, és add értékül a John Doe literált
        String name = "John Doe";

        // Definiálj egy message változót, mely az előző két változó, összefűzve
        String message = prefix + name;

        // A message változó értékét írd felül a message változó értékével úgy,
        // hogy hozzákapcsolod még a 444 int literál értékét
        // Jó lesz, meglásd! - bár értelmét még ne keresd
        message = message + 444;

        // A b logikai változó tartalmazza,
        // hogy a message értéke megegyezik-e a "Hello John Doe" literál értékével
        boolean b = message.equals("Hello John Doe");

        // A c logikai változó tartalmazza,
        // hogy a message értéke megegyezik-e a "Hello John Doe444" értékkel
        boolean c = message.equals("Hello John Doe444");

        // Konkatenálj össze két üres String-et,
        // és írd ki az értékét! Hány karakter hosszú lesz?
        String sample = "Abcde";
        System.out.println(sample.length());
        // Az első és harmadik karaktere (0-tól indexelünk) vesszővel elválasztva
        System.out.println(sample.charAt(0) + ", " + sample.charAt(2));
        // Az elsőtől a harmadik karakterig tartó részlete
        System.out.println(sample.substring(0, 3));

    }

}
