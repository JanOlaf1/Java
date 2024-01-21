package testi1;

import java.util.Scanner;

public class StringUsername {
	public static void main(String[] args) {
		/*
		 * This program, StringUsername, creates a username from the user's given name
		 * and surname, following specific rules. The main method prints the username or
		 * "Not enough letters" based on the inputted data.
		 */
		Scanner kayttaja = new Scanner(System.in);
		System.out.print("Enter given name: ");
		String nimi = kayttaja.nextLine();
		System.out.print("Enter surname: ");
		String snimi = kayttaja.nextLine();
		kayttaja.close();

		String username = createUsername(nimi, snimi);
		if (username != null) {
			System.out.println(username);
		} else {
			System.out.println("Not enough letters to create a username!");
		}
	}

	public static String createUsername(String nimi, String snimi) {
		if (nimi.length() >= 2 && snimi.length() >= 3) {
			String username = snimi.substring(snimi.length() - 3).toLowerCase() + nimi.substring(0, 2).toLowerCase();
			return username;
		} else {
			return null;
		}
	}
}
