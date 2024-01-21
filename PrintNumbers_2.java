package testi1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;

public class PrintNumbers_2 {
	public static void main(String[] args) {
		/*
		 * This program, PrintNumbers_2, is an enhanced version of PrintNumbers_1. In
		 * addition to printing integers on a single line, it also displays the count of
		 * numbers it has printed.
		 */
		Scanner loop = new Scanner(System.in);
		System.out.print("Enter the middle number: ");
		double loop1 = Double.parseDouble(loop.nextLine().replace(',', '.'));
		DecimalFormat nolla = new DecimalFormat("0");

		for (int loop2 = 1; loop2 <= loop1; loop2++) {
			System.out.println(loop2 + " ");
		}

		for (int loop3 = (int) loop1 - 1; loop3 >= 1; loop3--) {
			System.out.println(loop3 + " ");
		}

		if (loop1 > 1) {
			int tulos = (int) (loop1 * 2) - 1;
			System.out.println(nolla.format(tulos) + " numbers printed");
		} else if (loop1 == 1) {
			System.out.println("1 number printed");
		} else {
			System.out.println("0 numbers printed");
		}

		loop.close();
	}
}
