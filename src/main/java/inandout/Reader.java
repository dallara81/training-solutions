package inandout;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Reader {

    public void readSingleChar(){
        try {
            FileInputStream fis = new FileInputStream("C:\\training\\training-solutions\\src\\main\\resources\\fisfos.txt");
            int i = fis.read();
            System.out.println((char) i);
            fis.close();
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }

    public void readMultipleCharacters(){
        try {
            FileInputStream fis = new FileInputStream("C:\\training\\training-solutions\\src\\main\\resources\\fisfos.txt");
            int i = 0;
            String result = "";
            while((i=fis.read()) != -1){
                result += (char) i;
            }
            System.out.println(result);
            fis.close();
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }

    public void bufferedReader(){
        try {
            FileInputStream fis = new FileInputStream("C:\\training\\training-solutions\\src\\main\\resources\\fisfos.txt");
            BufferedInputStream bin = new BufferedInputStream(fis);
            int i = 0;
            String result = "";
            while((i=bin.read()) != -1){
                result += (char) i;
            }
            System.out.println(result);
            fis.close();
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    }

}