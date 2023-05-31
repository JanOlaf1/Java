package testi1;

import java.util.Scanner;

public class MethodsTriplex {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int b = a.nextInt();
        a.close();

        for (int i = 1; i <= b; i++) {
            int c = triplex(i);
            System.out.println("triplex(" + i + ") = " + c);
        }
    }

    public static int triplex(int x) {
        if (x == 1) {
            return 1;
        }

        int c = x;
        for (int i = 1; i < x; i += 3) {
            c *= i;
        }

        return c;
    }
}
