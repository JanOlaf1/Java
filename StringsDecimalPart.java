package testi1;
import java.util.Scanner;

public class StringsDecimalPart {
    public static void main(String[] args) {
    	/*This program, StringsDecimalPart, 
    	 * takes a decimal number input from the user. 
    	 * It then calculates the number of digits after the decimal point 
    	 * and prints the result. 
    	 * If the input is not a "proper decimal number," 
    	 * the program prints "Please enter a proper decimal number."*/
        Scanner desimaali = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        String syotto = desimaali.nextLine().replace(',', '.');

        if (!syotto.matches("^-?\\d+(\\.\\d+)?$")) {
            System.out.println("Please enter a proper decimal number");
        } else if (!syotto.matches(".*\\.\\d+$")) {
            System.out.println("Please enter a proper decimal number");
        } else {
            int deeeessi = desimaalimaara(syotto);
            System.out.println(deeeessi + " decimal place(s)");
        }

        desimaali.close();
    }

    private static int desimaalimaara(String numero) {
        int tulos = numero.indexOf('.');
        if (tulos >= 0 && tulos < numero.length() - 1) {
            return numero.length() - tulos - 1;
        } else {
            return 0;
        }
    }
}
