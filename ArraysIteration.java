package testi1;

import java.util.Scanner;
import java.util.Arrays;

/*This program, ArraysIteration, 
 * takes five integers from the user, 
 * stores them in an array, 
 * and prints the integers in descending order on a single line.*/
public class ArraysIteration {
	public static void main(String[] args) {
		Scanner tutka = new Scanner(System.in);
		int[] taulukko = new int[5];
		for (int i = 0; i < taulukko.length; i++) {
			System.out.print("Enter an integer: ");
			taulukko[i] = tutka.nextInt();
		}
		Arrays.sort(taulukko);

		for (int i = 0; i < taulukko.length / 2; i++) {
			int temp = taulukko[i];
			taulukko[i] = taulukko[taulukko.length - 1 - i];
			taulukko[taulukko.length - 1 - i] = temp;
		}

		for (int i = 0; i < taulukko.length; i++) {
			System.out.println(taulukko[i]);
		}
		tutka.close();
	}
}
