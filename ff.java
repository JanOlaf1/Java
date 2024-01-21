package testi1;
import java.util.Scanner;

public class ff {

	public class ArvosanaLaskuri {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Anna kokeen maksimipistemäärä: ");
	        double maksimipisteet = scanner.nextDouble();

	        System.out.print("Anna saadut pisteet: ");
	        double saadutPisteet = scanner.nextDouble();

	        double prosenttiosuus = (saadutPisteet / maksimipisteet) * 100;

	        System.out.println("Pisteet: " + saadutPisteet + "/" + maksimipisteet);
	        System.out.println("Tulos: " + prosenttiosuus + "%");

	        if (prosenttiosuus >= 90) {
	            System.out.println("Arvosana: Excellent");
	        } else if (prosenttiosuus >= 70) {
	            System.out.println("Arvosana: Good");
	        } else if (prosenttiosuus >= 50) {
	            System.out.println("Arvosana: Passed");
	        } else {
	            System.out.println("Arvosana: Failed");
	        }

	        scanner.close();
	    }
	}

}
