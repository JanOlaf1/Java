package testi1;

import java.util.Scanner;

public class MethodsTools {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*
		 * Methods Tools Introducing MethodsTools, a class for organizing generic
		 * methods as a library. This class, devoid of a main method, now includes the
		 * minimum method previously found in MethodsMinimum. Adjustments have been made
		 * to enable external accessibility. Next, in MethodsToolsProgram, the main
		 * method prompts the user for three integers, utilizes the minimum method from
		 * MethodsTools to find the minimum value, and prints the result.
		 */
		System.out.print("Enter first integer: ");
		int first = Integer.parseInt(scanner.nextLine());

		System.out.print("Enter second integer: ");
		int second = Integer.parseInt(scanner.nextLine());

		System.out.print("Enter third integer: ");
		int third = Integer.parseInt(scanner.nextLine());
		scanner.close();

		System.out.println();

		int sum_minimumm = MethodsToolsProgram(first, second, third);
		System.out.println("The minimum value is " + sum_minimumm);
	}

	public static int MethodsToolsProgram(int first, int second, int third) {
		int sum_minimumm = Math.min(first, Math.min(second, third));
		return sum_minimumm;

	}
}
