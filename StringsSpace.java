package testi1;
import java.util.Scanner;

public class StringsSpace {
	/*This program, StringsSpace, 
	 * removes extra whitespace from a user-inputted string 
	 * and prints the result enclosed in double quotes.*/
    private static String removeExtraSpace(String annettu) {
        String valiton = annettu.replaceAll("\\s+", " ").trim();
        return valiton;
    }

    public static void main(String[] args) {
        Scanner lause = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String annettu = lause.nextLine();
        
        String kasitelty = removeExtraSpace(annettu);
        System.out.println("\"" + kasitelty + "\"");
        lause.close();
    }
}
