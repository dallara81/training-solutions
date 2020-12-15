package week08d01;
// A török szultán elhatározza, hogy a 100 nap múlva lévő születésnapján szabadon enged néhány rabot a börtönéből.
// A börtönben 100 cella van. Mindegyik cella zárva van. Ha egyet fordítunk a kulcson akkor nyitva lesz,
// ha még egyet akkor zárva ha hármat akkor ismét nyitva és így tovább. A szultán azt a parancsot adja,
// hogy az első nap mindegyik cellán fordítsanak egyet.  (Ekkor minden cella nyitva lesz)
// A második napon minden másodikon fordítsanak egyet, így minden második zárva lesz.
// A harmadik napon minden harmadikon fordítsanak egyet így a 3. cella zárva , de a 6. cella például nyitva lesz.
// A week08d01.Sultan osztályba írj egy metódust openDoors() néven,  aminek visszatérési értékéből kiderül,
// hogy mely ajtók lesznek nyitva a 100. napon! Az osztály szabadon bővíthető!

import java.util.List;
import java.util.ArrayList;

public class Sultan {

    private final static int napokSzama = ajtokSzama;
    private final static int ajtokSzama = 100;
    private boolean[] ajtok = new boolean[ajtokSzama];


    public List<Integer> ajtok() {

        szamitas2();

        List<Integer> nyitottAjtok = new ArrayList<>();

        for (int i = 0; i < ajtokSzama; i++) {
            if (ajtok[i]) {
                nyitottAjtok.add(i + 1);
            }
        }
        return nyitottAjtok;
    }

    private void szamitas() {

        for (int i = 0; i < napokSzama; i++) {
            for (int j = 0; j < ajtokSzama; j++) {
                if ((j + 1) % (i + 1) == 0) {
                    ajtok[j] = !ajtok[j];
                }
            }
        }
    }

    private void szamitas2() {

        for (int i = 0; i < napokSzama; i++) {
            for (int j = i; j < ajtokSzama; j+=(i+1)) {
                ajtok[j] = !ajtok[j];
            }
        }
    }

    public static void main(String[] args) {

        Sultan szultan = new szultan();
        System.out.println(szultan.ajtok());

    }
}