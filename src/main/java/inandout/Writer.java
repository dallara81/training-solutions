package inandout;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer {

    public void writeSingleChar(){
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\InAndOut\\test.txt");
            fos.write(65);
            fos.flush();
            fos.close();
            System.out.println("Készen vagyok, teljesen");
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }

    public void writeMultipleCharacters(){
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\InAndOut\\test.txt");
            String text = "Fis-fos lehúzó";
            byte a[] = text.getBytes();
            fos.write(a);
            fos.flush();
            fos.close();
            System.out.println("Készen vagyok, teljesen");
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }

    public void bufferedWriter() throws FileNotFoundException, IOException{
        FileOutputStream fout = new FileOutputStream("C:\\Users\\user\\Desktop\\InAndOut\\test.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        String text = "Nem mindegy, hogy fis, fos vagy fis-fos";
        byte a[] = text.getBytes();
        bout.write(a);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Készen vagyok, teljesen");
    }

}