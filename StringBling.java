package testi1;

import java.util.Scanner;

public class StringBling {
	public static void main(String[] args) {
		/*
		 * This program, StringBling, inputs strings from the user until "stop" is
		 * entered. It determines the longest string (excluding "stop") and prints it
		 * enclosed in single quotes. In case of a tie, it prints the string entered
		 * first. If only "stop" is entered, the program prints "Nothing to be printed."
		 */
		Scanner sanat = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String sana1 = sanat.nextLine();

		String sana2 = "";
		String sana3 = "";

		while (!sana1.equalsIgnoreCase("stop")) {
			sana3 = sana1;

			if (sana3.length() > sana2.length()) {
				sana2 = sana3;
			}

			System.out.print("Enter next string: ");
			sana1 = sanat.nextLine();
		}

		if (sana2.isEmpty()) {
			System.out.println("Nothing to be printed");
		} else {
			System.out.println("'" + sana2 + "'");
		}
		sanat.close();
	}
}
