package sentencegenerator;

public class Game {

    public String generator(){

        String[] firstWord = {"Nagyon jó","Megbízható","Kiváló","Tökéletes","A legeslegjobb"};
        String[] secondWord = {"megoldás","lehetőség","kivitelezés"};
        String[] thirdWord = {"neked!","mindenkinek!","az egész világnak!","még a földönkívülieknek is!"};

        int firstLength = firstWord.length;
        int secondLength = secondWord.length;
        int thirdLength = thirdWord.length;

        int random1 = (int) (Math.random() * firstLength);
        int random2 = (int) (Math.random() * secondLength);
        int random3 = (int) (Math.random() * thirdLength);

        String sentence = firstWord[random1] + " " + secondWord[random2] + " " + thirdWord[random3];

        return sentence;
    }
}
