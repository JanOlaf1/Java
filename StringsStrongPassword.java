package testi1;
import java.util.Scanner;

public class StringsStrongPassword {
    /*This program, StringsStrongfPassword, 
     * checks the strength of a password. 
     * The main method inputs a password, 
     * calls the checkStrength method, 
     * and prints "OK" if the password is strong enough; 
     * otherwise, it prints "Not strong enough!" 
     * A strong password has at least 8 characters 
     * and includes characters from three different categories: 
     * uppercase, lowercase, digits, and others.*/
  
    public static boolean checkStrength(String password) {
        // Check if the password has at least 8 characters
        if (password.length() < 8) {
            return false;
        }
        
        int categoriesCount = 0;
        
        if (password.matches(".*[A-Z].*")) {
            categoriesCount++;
        }
        
        if (password.matches(".*[a-z].*")) {
            categoriesCount++;
        }
        
        if (password.matches(".*\\d.*")) {
            categoriesCount++;
        }
        
        // Check for other characters
        if (password.matches(".*[^A-Za-z0-9].*")) {
            categoriesCount++;
        }
        
        return categoriesCount >= 3;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input password from the user
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        
        // Check the strength of the password
        boolean isStrong = checkStrength(password);
        
        // Print the result
        if (isStrong) {
            System.out.println("OK");
        } else {
            System.out.println("Not strong enough!");
        }
        scanner.close();
    }
}