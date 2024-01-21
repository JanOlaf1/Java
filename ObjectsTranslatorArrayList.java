package testi1;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsTranslatorArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<WordPair> wordPairs = new ArrayList<>();
        
        while (true) {
            System.out.print("Enter English word (or 'ok' to stop): ");
            String englishWord = scanner.nextLine();
            
            if (englishWord.equalsIgnoreCase("ok")) {
                break;
            }
            
            System.out.print("Enter Finnish word: ");
            String finnishWord = scanner.nextLine();
            
            WordPair wordPair = new WordPair(englishWord, finnishWord);
            wordPairs.add(wordPair);
        }
        
        while (true) {
            System.out.print("Enter English word to translate (or 'quit' to exit): ");
            String inputWord = scanner.nextLine();
            
            if (inputWord.equalsIgnoreCase("quit")) {
                break;
            }
            
            boolean wordFound = false;
            for (WordPair wordPair : wordPairs) {
                if (wordPair.getEnglishWord().equalsIgnoreCase(inputWord)) {
                    System.out.println("Finnish translation: " + wordPair.getFinnishWord());
                    wordFound = true;
                    break;
                }
            }
            
            if (!wordFound) {
                System.out.println("Unknown word");
            }
            scanner.close();
        }
        
        System.out.println("Exiting the translator.");
    }
}
