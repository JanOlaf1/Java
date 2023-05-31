package testi1;
import java.util.Scanner;

public class MethodsMinimum {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int b = Integer.parseInt(a.nextLine());

        System.out.print("Enter second integer: ");
        int c = Integer.parseInt(a.nextLine());

        System.out.print("Enter third integer: ");
        int d = Integer.parseInt(a.nextLine());

        System.out.println();
        
        int e = minimum(b, c, d);
        System.out.println("The minimum value is " + e);

        a.close();
    }

    public static int minimum(int b, int c, int d) {
        int e = Math.min(b, Math.min(c, d));
        return e;
    }
}
