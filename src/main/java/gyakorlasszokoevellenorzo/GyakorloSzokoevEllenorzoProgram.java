package gyakorlasszokoevellenorzo;

    public class GyakorloSzokoevEllenorzoProgram {

        public static void main(String[] args) {

            // Ide véddük be, hogy melyik évet szeretnénk ellenőrizni
            int year = 1980;
            boolean leap = false;

            // Az évszám osztható néggyel?
            if (year % 4 == 0) {

                // Ha az év évszázadforduló
                if (year % 100 == 0) {

                    // Ha az év osztható 400-al
                    // Nos, akkor  a Gergely-naptár szerint megadtunk minden szököév-opciót
                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }

                // Ha egyik sem
                else
                    leap = true;
            }

            else
                leap = false;

            if (leap)
                System.out.println(year + " szőkőév.");
            else

                System.out.println(year + " nem szökőév.");

    }
}
