package testi1;
import java.util.Scanner;

public class ArraysCandidates {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);   
        System.out.print("Enter the number of candidates: ");
        int f = a.nextInt();
        a.nextLine(); 

        String[] g = new String[f]; 
        int[] i = new int[f];
        
        for (int c = 0; c < f; c++) {
            System.out.print("Enter name: ");
            g[c] = a.nextLine(); 
            
            System.out.print("Enter " + g[c] + "'s votes: ");
            i[c] = a.nextInt();
            a.nextLine();
        }
        
        int m = i[0];
        int n = 0;
        boolean p = false;
        
        for (int c = 1; c < f; c++) {
            if (i[c] > m) {
                m = i[c];
                n = c;
                p = false;  
            } else if (i[c] == m) {
                p = true;  
            }
        }
        
        if (p) {
            System.out.println("It is a tie!");
            for (int c = 0; c < f; c++) {
                if (i[c] == m) {
                    System.out.println(g[c] + " (" + i[c] + " votes)");
                }
            }
        } else {
        	System.out.println();
            System.out.println(g[n] + " is the winner with " + i[n] + " votes!");
        }
    }
}

