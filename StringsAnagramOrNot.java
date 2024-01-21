package testi1;
import java.util.Arrays;
import java.util.Scanner;
/*This program, StringsAnagramOrNot, 
 * includes an isAnagram method that checks if two inputted strings are anagrams.
 * The main method takes two strings from the user,
 *  calls isAnagram, and prints either "Anagram!" or "No anagram."*/
public class StringsAnagramOrNot {
    private static boolean laittomatkirjaimetprkle(String text) {
        String sallitut = "abcdefghijklmnopqrstuvwxyzåäjaöABCDEFGHIJKLMNOPQRSTUVWXYZÅÄJAÖ ,.;";
        for (char a : text.toCharArray()) {
            if (!sallitut.contains(String.valueOf(a))) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAnagram(String text1, String text2) {
        text1 = text1.replaceAll("[ ,.;]", "").toLowerCase();
        text2 = text2.replaceAll("[ ,.;]", "").toLowerCase();

        if (text1.isEmpty() || text2.isEmpty() || laittomatkirjaimetprkle(text1) || laittomatkirjaimetprkle(text2)) {
            return false;
        }

        char[] char1 = text1.toCharArray();
        char[] char2 = text2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String text1 = scanner.nextLine();
        System.out.println("Enter second string: ");
        String text2 = scanner.nextLine();
        scanner.close();

        if (isAnagram(text1, text2)) {
            System.out.println("Anagram!");
        } else {
            System.out.println("No anagram");
        }
    }
}
