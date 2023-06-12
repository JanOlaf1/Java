package testi1;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysCities {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number of city names: ");
        int b = a.nextInt();
        
        String[] c = new String[b];
        for (int d = 0; d < b; d++) {
            System.out.print("Enter city name: ");
            String e = a.next();
            c[d] = e;
        }
        
        Arrays.sort(c);
        System.out.println();
      
        
       
        System.out.print(c[0]);
        
        
        for (int i = 1; i < c.length; i++) {
            if (!c[i].equals(c[i-1])) {
                System.out.print(" " + c[i]);
                
                a.close();
            }
        }
    }
}
