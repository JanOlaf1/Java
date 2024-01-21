package testi1;

import java.util.Scanner;

public class RegexLetters {
	public static void main(String[] args) {
		/*
		 * This program, RegexLetters, takes a string from the user. If the string
		 * contains only Finnish vowels, it prints "Vowels only"; otherwise, it prints
		 * "Not only vowels." The string is validated using a single regular expression.
		 */
		Scanner vokaalit = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String syotto = "oiEuaeåy";

		if (syotto.matches("[aeiouyäöåAEIOUYÅÄÖ]+")) {
			System.out.println("Vowels only");
		} else {
			System.out.println("Not only vowels!");
		}

		vokaalit.close();
	}
}
