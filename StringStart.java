package testi1;

import java.util.Scanner;

/*This program, StringStart, 
 * takes a string input from the user 
 * and prints the string in lowercase, uppercase, and its length.*/
public class StringStart {
	public static void main(String[] args) {
		Scanner tutka = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String sana = tutka.nextLine();

		String isompi = sana.toUpperCase();
		String pienempi = sana.toLowerCase();
		int pituuus = sana.length();
		System.out.println();
		System.out.println(pienempi);
		System.out.println(isompi);
		System.out.println(pituuus + " characters");
		tutka.close();
	}
}
