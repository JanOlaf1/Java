package testi1;

import java.util.Scanner;

public class ArraysCandidates {
	public static void main(String[] args) {
		/*
		 * This program, ArraysCandidates, takes the number of candidates as input. It
		 * then inputs the name and number of votes for each candidate. Finally, it
		 * determines and displays the winner's name and votes.
		 */
		Scanner tutka = new Scanner(System.in);
		System.out.print("Enter the number of candidates: ");
		int kandidaatit = tutka.nextInt();
		tutka.nextLine();

		String[] taulukko = new String[kandidaatit];
		int[] array = new int[kandidaatit];

		for (int x = 0; x < kandidaatit; x++) {
			System.out.print("Enter name: ");
			taulukko[x] = tutka.nextLine();

			System.out.print("Enter " + taulukko[x] + "'s votes: ");
			array[x] = tutka.nextInt();
			tutka.nextLine();
		}

		int muuttuja = array[0];
		int vastaus = 0;
		boolean tasan = false;

		for (int x = 1; x < kandidaatit; x++) {
			if (array[x] > muuttuja) {
				muuttuja = array[x];
				vastaus = x;
				tasan = false;
			} else if (array[x] == muuttuja) {
				tasan = true;
			}
		}

		if (tasan) {
			System.out.println("It is a tie!");
			for (int x = 0; x < kandidaatit; x++) {
				if (array[x] == muuttuja) {
					System.out.println(taulukko[x] + " (" + array[x] + " votes)");
				}
			}
		} else {
			System.out.println();
			System.out.println(taulukko[vastaus] + " is the winner with " + array[vastaus] + " votes!");
		}
		tutka.close();
	}
}
