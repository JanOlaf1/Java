package testi1;

import java.util.Scanner;

public class ValidateAnswer {
	public static void main(String[] args) {
		/*
		 * This program, ValidateAnswer, asks the user to answer the question
		 * "What is 2 + 3?" and keeps prompting for an answer until the correct one is
		 * provided.
		 */
		Scanner viiiitonen = new Scanner(System.in);
		System.out.print("What is 2 + 3? ");
		int oik = 5;
		double a;

		while (true) {
			String input = viiiitonen.nextLine().replace(',', '.');
			try {
				a = Double.parseDouble(input);
				break;
			} catch (NumberFormatException e) {
				System.out.println("That is not a number! Try again: ");
			}
		}

		if (a != oik) {
			System.out.print("Incorrect! Try again: ");
			while (true) {
				String input = viiiitonen.nextLine().replace(',', '.');
				try {
					a = Double.parseDouble(input);
					break;
				} catch (NumberFormatException e) {
					System.out.print("That is not a number! Try again: ");
				}
			}
		}

		if (a != oik) {
			System.out.println("Incorrect! Try again: ");
		} else {
			System.out.println("Correct!");
		}
		viiiitonen.close();
	}
}
