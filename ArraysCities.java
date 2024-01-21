package testi1;

import java.util.Arrays;
import java.util.Scanner;

/*This program, ArraysCities, 
 *inputs the number of cities, creates an array, 
 *inputs and saves cities to it, 
 *and then prints all distinct city names in alphabetical order.
 *Refer to the example output for details.*/
public class ArraysCities {
	public static void main(String[] args) {
		Scanner skanneri = new Scanner(System.in);
		System.out.println("Enter the number of city names: ");
		int city_amount = skanneri.nextInt();

		String[] taulukko = new String[city_amount];
		for (int i = 0; i < city_amount; i++) {
			System.out.print("Enter city name: ");
			String muuttuja = skanneri.next();
			taulukko[i] = muuttuja;
		}

		Arrays.sort(taulukko);
		System.out.println();

		System.out.print(taulukko[0]);

		for (int i = 1; i < taulukko.length; i++) {
			if (!taulukko[i].equals(taulukko[i - 1])) {
				System.out.print(" " + taulukko[i]);

				skanneri.close();
			}
		}
	}
}
