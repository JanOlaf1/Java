package testi1;

import java.util.Scanner;

public class RegexStudentNumber {
	public static void main(String[] args) {
		/*
		 * This program, RegexStudentNumber, takes a student number from the user. If
		 * the input starts with '2' and has exactly 8 digits, it prints "OK";
		 * otherwise, it prints "Invalid student number." The validation is done using a
		 * single regular expression.
		 */
		Scanner numero = new Scanner(System.in);
		System.out.println("Enter student number: ");
		String matches = numero.nextLine();

		if (matches.length() == 8 && matches.charAt(0) == '2') {

			System.out.println("OK");
		} else {
			System.out.println("Invalid student number");
			numero.close();
		}
	}
}
