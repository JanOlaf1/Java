package testi1;

import java.util.Scanner;

/*This program, ArraysLetters, 
 * takes a grade letter from the user, 
 * computes, 
 * and displays the percentage of the grade letter found in an array containing values: 
 * "A", "A", "B", "A", "C", "B", "C", "F", "B", "B", "B", "A", "C", "C", "C".*/
public class ArraysLetters {
	public static void main(String[] args) {
		Scanner skanner = new Scanner(System.in);
		char[] taulukkko = { 'A', 'A', 'B', 'A', 'C', 'B', 'C', 'F', 'B', 'B', 'B', 'A', 'C', 'C', 'C' };
		System.out.println("Enter letter: ");
		char kirjain = skanner.next().charAt(0);

		int arvo = 0;
		for (char letter : taulukkko) {
			if (letter == kirjain) {
				arvo++;
			}
		}

		double vastaus = (double) arvo / taulukkko.length * 100;
		String Loppu_Silaus = String.format("%.2f%%", vastaus);
		/*
		 * Toinen tapa formatoimiseen. Import java.text.DecimalFormat DecimalFormat nimi
		 * = new DecimalFormat("0.00000000000"; Sit formatoidaan tahdottu vastaus.
		 * nimi.format(Loppu_Silaus)....
		 */

		System.out.println(Loppu_Silaus);
		skanner.close();
	}

	@SuppressWarnings("unused")
	private static boolean isValidGrade(char letter) {
		return (letter >= 'A' && letter <= 'F');
	}
}
