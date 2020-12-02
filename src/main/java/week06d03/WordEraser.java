package week06d03;
// A week06d03.WordEraser osztályban legyen egy eraseWord(String words, String word) metódus,
// mely az első paraméter szöveget úgy változtatja meg, hogy a második paraméter összes előforulását kitörli belőle.
// A words paraméterben a szavak szóközzel vannak elválasztva. A metódus térjen vissza a törölni kívánt szavak nélküli Stringgel.
// (Mellőzzük a replace és replaceAll használatát)

public class WordEraser {

    public String eraseWord(String words, String word) {

        StringBuilder builder = new StringBuilder();
        String[] arrWords = words.split(" ");

        for (int i =0; i < arrWords.length; i++) {
            if (!arrWords[i].equals(word)) {
                builder.append(arrWords[i] + " ");
            }
        }
        return builder.toString().trim();
    }
}