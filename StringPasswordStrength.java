package testi1;

import java.util.Scanner;

public class StringPasswordStrength {
	public static void main(String[] args) {
		/*
		 * This program, StringPasswordStrength, includes a method checkStrength to
		 * validate a password against requirements. The main method inputs a username
		 * and password, calls checkStrength, and prints "OK" if the password is valid;
		 * otherwise, it prints "NOT OK."
		 */
		Scanner tunnukset = new Scanner(System.in);
		System.out.print("Enter username: ");
		String kayttaja = tunnukset.nextLine();
		System.out.print("Enter password: ");
		String sala = tunnukset.nextLine();
		boolean tarkistus = checkStrength(sala, kayttaja);

		if (tarkistus) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}

		tunnukset.close();
	}

	public static boolean checkStrength(String sala, String kayttaja) {
		if (sala.length() >= 9 && !sala.contains(kayttaja) && containsNumbers(sala)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean containsNumbers(String str) {
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
}
