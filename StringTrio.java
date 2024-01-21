package testi1;

import java.util.Scanner;

public class StringTrio {
	public static void main(String[] args) {
		/*
		 * This program, StringTrio, takes three strings, compares them, and indicates
		 * their equality based on case sensitivity.
		 */
		Scanner lausekkeet = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String lause1 = lausekkeet.nextLine();

		System.out.print("Enter second string: ");
		String lause2 = lausekkeet.nextLine();

		System.out.print("Enter third string: ");
		String lause3 = lausekkeet.nextLine();

		boolean case_sensitive = lause1.equals(lause2) && lause1.equals(lause3);
		boolean case_insensitive = lause1.equalsIgnoreCase(lause2) && lause1.equalsIgnoreCase(lause3);
		System.out.println("");
		if (case_sensitive) {
			System.out.println("The strings are equal in case-sensitive comparison");
		} else if (case_insensitive) {
			System.out.println("The strings are equal in case-insensitive comparison");
		} else {
			System.out.println("The strings are not equal");
		}
		lausekkeet.close();
	}
}
