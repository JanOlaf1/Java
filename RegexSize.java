package testi1;

import java.util.Scanner;

public class RegexSize {
	public static void main(String[] args) {
		/*
		 * This program, RegexSize, takes a size code (XXS, XS, S, M, L, XL, XXL) from
		 * the user and prints either "Size ok" or "Invalid size" based on a single
		 * regular expression validation.
		 */
		Scanner koko = new Scanner(System.in);
		System.out.println("Enter size: ");
		String annettu = koko.nextLine();
		annettu = annettu.toUpperCase();
		String[] myArray = { "XXL", "XL", "L", "M", "S", "XS", "XXS" };

		boolean matches = false;
		for (String size : myArray) {
			if (annettu.equals(size)) {
				matches = true;
				break;
			}
		}

		if (!matches) {
			System.out.println("Invalid size");
		} else {
			System.out.println("Size ok");
		}
		koko.close();
	}
}
