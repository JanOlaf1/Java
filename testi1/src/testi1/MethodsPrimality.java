package testi1;
import java.util.Scanner;

public class MethodsPrimality {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int b = a.nextInt();
        a.close();

        boolean g = false;

        for (int i = 1; i < b; i++) {
            if (!isPrime(i)) {
                System.out.print(i + " ");
                g = true;
            }
        }

        if (!g) {
            System.out.println("Nothing to be printed");
        } else {
            System.out.println();
        }
    }

    public static boolean isPrime(int b) {
        if (b <= 1) {
            return false;
        }

        for (int i = 2; i < b; i++) {
            if (b % i == 0) {
                return false;
            }
        }

        return true;
    }
}
