package testi1;

import java.util.Scanner;
/*
This program, StringsPalindromeSentence, 
contains an isPalindrome method that checks if a string contains a palindrome. 
The main method takes a string from the user, 
calls isPalindrome, and prints either "Palindrome!" or "No palindrome."*/
public class StringsPalindromeSentence {
    private static boolean laittomatkirjaimetprkle(String loppu) {
        String sallitut = "abcdefghijklmnopqrstuvwxyzåäjaöABCDEFGHIJKLMNOPQRSTUVWXYZÅÄJAÖ ,.'?;!-\"";
        for (char a : loppu.toCharArray()) {
            if (!sallitut.contains(String.valueOf(a))) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(String vast) {
        String loppu = vast.replaceAll("[ ,.'?;!-]", "").toLowerCase();

        if (laittomatkirjaimetprkle(loppu)) {
            return false;
        }

        String valiaikanen = "";
        for (int i = loppu.length() - 1; i >= 0; i--) {
            valiaikanen = valiaikanen + loppu.charAt(i);
        }

        return loppu.equals(valiaikanen);
    }

    public static void main(String[] args) {
        Scanner pali = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String vast = pali.nextLine();
        if (isPalindrome(vast)) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("No palindrome");
        }
        pali.close();
    }
}
