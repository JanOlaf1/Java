package testi1;

import java.util.Scanner;

public class ValidateOddNumber {
	public static void main(String[] args) {
		/*
		 * This program, ValidateOddNumber, prompts the user to enter an odd number. It
		 * prints an error message if the input cannot be converted to an integer or if
		 * the input is not an odd number. Otherwise, it prints "Ok."
		 */
		Scanner tutka = new Scanner(System.in);
		System.out.print("Enter an odd number: ");
		String luku = tutka.nextLine();
		try {
			int muuttuja = Integer.parseInt(luku);
			if (muuttuja % 2 == 0) {
				System.out.println("");
				System.out.println(luku + " is not an odd number");
			} else {
				System.out.println("");
				System.out.println("Ok");
			}
		} catch (NumberFormatException e) {
			System.out.println();
			System.out.println("'" + luku + "' is not an integer");
		}

		tutka.close();
	}
}
