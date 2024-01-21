package testi1;

public class MethodsWarmup {
	public static void main(String[] args) {
		/*
		 * This program, MethodsWarmup, includes a method called printNumbers, which
		 * prints positive even and odd numbers between 1 and 50. The main method calls
		 * printNumbers, utilizing a for loop in the program.
		 */
		printNumbers();
	}

	public static void printNumbers() {
		for (int x = 2; x <= 50; x += 2) {
			System.out.print(x + " ");
		}
		System.out.println();

		for (int y = 49; y >= 1; y -= 2) {
			System.out.print(y + " ");
		}
	}
}
