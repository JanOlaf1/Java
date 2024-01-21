package testi1;

import java.util.Scanner;

public class StringCharacters {
	public static void main(String[] args) {

		/*
		 * This program, StringCharacters, takes a string input from the user and prints
		 * the count of letters, digits, and other characters in the string.
		 */
		Scanner tutka = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String sana = tutka.nextLine();

		int kirjain = 0;
		int numerot = 0;
		int muut = 0;

		for (char c : sana.toCharArray()) {
			if (Character.isLetter(c)) {
				kirjain++;
			} else if (Character.isDigit(c)) {
				numerot++;
			} else {
				muut++;
			}
		}
		tutka.close();
		System.out.println(kirjain + " letter(s)");
		System.out.println(numerot + " digit(s)");
		System.out.println(muut + " other character(s)");
	}
}
