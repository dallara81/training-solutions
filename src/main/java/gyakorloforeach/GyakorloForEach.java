package gyakorloforeach;

import java.util.Map;
import java.util.HashMap;

public class GyakorloForEach {

    public static void main(String[] args) {

        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Hétfő");
        hmap.put(2, "Kedd");
        hmap.put(3, "Szerda");
        hmap.put(4, "Csütörtök");
        hmap.put(5, "Péntek");
        hmap.put(6, "Szombat");
        hmap.put(7, "Vasárnap");

        hmap.forEach((key,value)->System.out.println(key+" - "+value));

        hmap.forEach((key,value)->{
            if(key == 5){
                System.out.println("Az 5. értéke > "+value);
            }
        });

        hmap.forEach((key,value)->{
            if("Kedd".equals(value)){
                System.out.println("A keddhez tartozó szám > "+key);
            }
        });
    }
}