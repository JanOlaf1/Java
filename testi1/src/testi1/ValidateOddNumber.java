package testi1;
import java.util.Scanner;

public class ValidateOddNumber {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        String b = a.nextLine();
        try {
            int c = Integer.parseInt(b);
            if (c % 2 == 0) {
            	System.out.println("");
                System.out.println(b + " is not an odd number");
            } else {
            	System.out.println("");
                System.out.println("Ok");
            }
        } catch (NumberFormatException e) {
        	System.out.println();
            System.out.println("'" + b + "' is not an integer");
        }

        a.close();
    }
}
