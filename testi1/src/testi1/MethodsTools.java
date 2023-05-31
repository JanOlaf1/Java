package testi1;
import java.util.Scanner;
public class MethodsTools {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int b = Integer.parseInt(a.nextLine());
		
		System.out.print("Enter second integer: ");
		int c = Integer.parseInt(a.nextLine());
		
		System.out.print("Enter third integer: ");
		int d = Integer.parseInt(a.nextLine());
		a.close();
		
		System.out.println();
		
		int y =MethodsToolsProgram(b, c, d);
		System.out.println("The minimum value is " + y);
	}
	public static int MethodsToolsProgram(int b, int c, int d){
		int y = Math.min(b, Math.min(c, d));
		return y;
		
	}
}

