package week05d02;

import java.util.Scanner;

public class ChangeLetterEgyedi {

    public static void main(String[] args) {

        System.out.println("A kritikát és a magánhangzókat nem toleráljuk!\nKNDK Szoftverparancsnokság\n");
        // System.out.println(" "); - OBS! Ez már nem elég trendi.

        System.out.println("Csak óvatosan!");
        Scanner scan=new Scanner(System.in);
        System.out.println("Kérem a szöveget > ");
        String st=scan.nextLine();
        char ch[]=st.toCharArray();
        for (int i = 0; i < ch.length; i++)

        {
            if (ch[i]=='i'||ch[i]=='e'||ch[i]=='a'||ch[i]=='u'||ch[i]=='o')
            {
                ch[i]='*'; // OSB! Ez a csillagozás-dolog nekem még jól jöhet később is! Hehe
            }
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
