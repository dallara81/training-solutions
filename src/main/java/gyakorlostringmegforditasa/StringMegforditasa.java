package gyakorlostringmegforditasa;

public class StringMegforditasa {

    public static void main(String[] args) {

        String string = "a cápa ette apáca";

        String reversedStr = "";


        for(int i = string.length()-1; i >= 0; i--){
            reversedStr = reversedStr + string.charAt(i);
        }

        System.out.println("Eredeti string > " + string);

        System.out.println("A string visszafelé > " + reversedStr);
    }
}
