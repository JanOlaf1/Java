package testi1;

import java.util.Scanner;

public class DivisionAndRemainder {
	public static void main(String[] args) {
		/*
		 * Program DivisionAndRemainder inputs two integers (x and y), determines if
		 * they are even or odd, and computes the remainders of x / y and y / x.
		 */
		Scanner divi = new Scanner(System.in);
		System.out.print("Enter x: ");
		int luku1 = divi.nextInt();

		System.out.print("Enter y: ");
		int luku2 = divi.nextInt();
		System.out.println();
		if (luku1 % 2 == 0) {
			System.out.println(luku1 + " is even");
		} else {
			System.out.println(luku1 + " is odd");
		}

		if (luku2 % 2 == 0) {
			System.out.println(luku2 + " is even");
		} else {
			System.out.println(luku2 + " is odd");
		}

		int tulos = luku1 % luku2;
		int tulos1 = luku2 % luku1;
		System.out.println("The remainder of " + luku1 + " / " + luku2 + " is " + tulos);
		System.out.println("The remainder of " + luku2 + " / " + luku1 + " is " + tulos1);

		divi.close();
	}
}
