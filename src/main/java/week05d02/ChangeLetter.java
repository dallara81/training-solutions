package week05d02;

import java.util.Scanner;

public class ChangeLetter {

    public static void main(String[] args) {

        System.out.println("A kritikát és az angolszász magánhangzókat nem toleráljuk!\nKNDK Szoftverparancsnokság\n");
        // System.out.println(" "); - OBS! Ez már nem elég trendi.

        System.out.println("Csak óvatosan!");
        Scanner scan=new Scanner(System.in);
        System.out.println("Kérem a szöveget > ");
        String st=scan.nextLine();
        char ch[]=st.toCharArray();
        for (int i = 0; i < ch.length; i++)

        {
            if (ch[i]=='i'||ch[i]=='e'||ch[i]=='a'||ch[i]=='u'||ch[i]=='o')
            // if (ch[i]=='a'||ch[i]=='á'||ch[i]=='e'||ch[i]=='é'||ch[i]=='i'||ch[i]=='í'||ch[i]=='o'||ch[i]=='ó'||ch[i]=='ö'||ch[i]=='ő'||ch[i]=='u'||ch[i]=='ú'||ch[i]=='ü'||ch[i]=='ű')
            // Csere, ha a magyar magánhangzókat sem szeretjük
            {
                ch[i]='*'; // OSB! Ez a csillagozás-dolog nekem még jól jöhet később is! Hehe
            }
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}