package gyakorloosztas1;

import java.util.Scanner;

public class DivideEx {

        public static void main(String[] args)
        {
            System.out.println("Megosztott-Osztó-Posztó Szoftver v0.1");
            Scanner input = new Scanner (System.in);
            System.out.print("Vésd be az osztandó számot! > ");
            int a = input.nextInt();
            System.out.print("Mégis mit gondolsz, mi ez? Az osztót is, de villámgyorsan! > ");
            int b = input.nextInt();
            int d = (a/b);
            System.out.println();
            System.out.println("Nesze bzdmg! > " +d);
        }
    }