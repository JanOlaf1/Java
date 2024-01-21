package testi1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPlateNumber {
	public static void main(String[] args) {
		/*
		 * This program, RegexPlateNumber, takes a car plate number from the user. If
		 * the plate number follows the format of three uppercase English letters, a
		 * hyphen, and three digits, it prints "OK"; otherwise, it prints
		 * "Invalid plate number." The validation is done using a single regular
		 * expression.
		 */
		Scanner rekkari = new Scanner(System.in);
		System.out.print("Enter plate number: ");
		String numero = rekkari.nextLine();

		if (Oikrekkari(numero)) {
			System.out.println("OK");
		} else {
			System.out.println("Invalid plate number");
		}
		rekkari.close();
	}

	public static boolean Oikrekkari(String numero) {
		String pattern = "^[A-Z]{3}-\\d{3}$";
		return Pattern.matches(pattern, numero);

	}
}
