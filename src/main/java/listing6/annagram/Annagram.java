package listing6.annagram;

public class Annagram {
    public String changeLetter(String word){
       String letter = word.substring(0,1);
       String theRestOfTheWord = word.substring(1);
       if (theRestOfTheWord.length() < 2) {
           return theRestOfTheWord + letter;
       }
       System.out.println("word: " +  theRestOfTheWord + letter);
       rotate(theRestOfTheWord);
       return changeLetter(theRestOfTheWord);
    }

    public void rotate(String word) {
        System.out.println(word.length());
        for (int i = 0; i < word.length(); i++) {
           String let = word.substring(0,1);
           word = word.substring(1);
           System.out.println("rotate word result = " + word + let);
           word = word + let;
        }
    }
}
