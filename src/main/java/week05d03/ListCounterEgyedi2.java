package week05d03;

import java.util.Scanner;

public class ListCounterEgyedi2 {

    public static void main(String[] args) {

        String test = "A rekettyésben eltévedt a medve - mi tagadás - hat a 6 alma, %-a 6 x 6, te marha!";
        count(test);

    }
    public static void count(String x){
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for(int i = 0; i < x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else{
                other ++;
            }
        }
        System.out.println("A rekettyésben eltévedt a medve, mi tagadás, hat a 6 alma, %-a 6 x 6, te marha!");
        System.out.println("betű: " + letter);
        System.out.println("szóköz: " + space);
        System.out.println("szám: " + num);
        System.out.println("egyéb karakter: " + other);
    }
}
