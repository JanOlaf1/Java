package testi1;

import java.util.Scanner;

public class ArraysFinnish {
	public static void main(String[] args) {
		/*
		 * The program, ArraysFinnish, translates user-inputted English words to Finnish
		 * for a predefined set of words. If the word is unknown, it displays
		 * "Unknown word," using two arrays.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an English word: ");
		String English_word = sc.nextLine();

		String[] esanat = { "bus", "car", "cat", "house", "moon", "sun", "thanks", "train", "teacher" };
		String[] fsanat = { "bussi", "auto", "kissa", "talo", "kuu", "aurinko", "kiitos", "juna", "opettaja" };

		boolean tarkistus = false;
		for (int i = 0; i < esanat.length; i++) {
			if (English_word.equalsIgnoreCase(esanat[i])) {
				System.out.println(fsanat[i]);
				tarkistus = true;
				break;
			}
		}

		if (!tarkistus) {
			System.out.println("Unknown word");
		}
		sc.close();
	}
}
