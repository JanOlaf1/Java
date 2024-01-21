package testi1;
import java.util.Scanner;

public class ObjectsTranslatorArray {
    public static void main(String[] args) {
        WordPaira[] wps = {
            new WordPaira("bird", "lintu"),
            new WordPaira("bar", "baari"),
            new WordPaira("bus", "bussi"),
            new WordPaira("car", "auto"),
            new WordPaira("cat", "kissa"),
            new WordPaira("dog", "koira")
        };

        Scanner tieto = new Scanner(System.in);

        System.out.print("Enter an English word: ");
        String syottetty_sana = tieto.nextLine();

        boolean foundTranslation = false;
        for (WordPaira wp : wps) {
            if (wp.getEnglishWord().equals(syottetty_sana)) {
                System.out.println(wp.getFinnishWord());
                foundTranslation = true;
                break;
            }
        }

        if (!foundTranslation) {
            System.out.println("Unknown word");
        }

        tieto.close();
    }
}
