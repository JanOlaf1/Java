package testi1;

public class MethodsWarmup {
    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        for (int x = 2; x <= 50; x += 2) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        for (int y = 49; y >= 1; y -= 2) {
            System.out.print(y + " ");
        }
    }
}
