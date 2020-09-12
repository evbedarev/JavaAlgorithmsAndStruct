package listing6.annagram;

public class Annagram {
    String partOfWord = "";
    int printCount = 0;
    public void changeLetter(String word){
       rotate(word);
    }

    public String rotate(String word) {
        String finalWord = word; //remember word at start
        if (word.length() == 2) {
            printWord(word);
            printWord(word.substring(1) + word.substring(0, 1));
            return word;
        }
        for (int i = 0; i < word.length(); i++) {
            partOfWord = partOfWord + word.substring(0,1);
            rotate(word.substring(1));
            word = word.substring(1) + word.substring(0,1);
            partOfWord = partOfWord.substring(0, partOfWord.length() - 1);
        }
        return finalWord;
    }

    public void printWord(String word) {
        System.out.println(++printCount + " " + partOfWord + word);
    }
}
