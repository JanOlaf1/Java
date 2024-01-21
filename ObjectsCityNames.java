package testi1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ObjectsCityNames {
    public static void main(String[] args) {
    	/*The program called ObjectsCityNames
    	 *  receives city names entered by the user until the user inputs "quit". 
    	 * After that, 
    	 * the program prints the city names in uppercase in alphabetical order.*/
    	
    	
        Scanner kaupunki = new Scanner(System.in);
        ArrayList<String> kaupunkiLista = new ArrayList<>();

        while (true) {
            System.out.println("Enter city name: ");
            String tallennus = kaupunki.nextLine().toLowerCase();

            if (tallennus.equals("quit")) {
                break;
            }

            kaupunkiLista.add(tallennus);
        }

        Collections.sort(kaupunkiLista);

        for (String kaupunkiNimi : kaupunkiLista) {
            System.out.println(kaupunkiNimi.toUpperCase());
        }
        kaupunki.close();
    }
}
