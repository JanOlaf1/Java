package testi1;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysLibrary {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int b = a.nextInt();

        if (b < 4) {
            System.out.println("Sorry, at least 4 values required.");
            return;
        }

        int[] d = new int[b];
        double o = 0;
        for (int c = 0; c < b; c++) {
            System.out.print("Enter an integer: ");
            int e = a.nextInt();
            o += e;
            d[c] += e;
        }

        Arrays.sort(d);
        DecimalFormat unocomprende = new DecimalFormat("0.0");
        int f = min(d);
        int m = max(d);
        double s = o / b;
        double median = median(d);
        double standardDeviation = standardDeviation(d);

        System.out.println();
        System.out.println("n = " + b);
        System.out.println("Min: " + f);
        System.out.println("Max: " + m);
        System.out.println("Mean: " + unocomprende.format(s));
        System.out.println("Median: " + unocomprende.format(median));
        System.out.println("Sample standard deviation: " + unocomprende.format(standardDeviation));
        System.out.print("Sample data: ");
        for (int i = 0; i < b; i++) {
            System.out.print(d[i] + " ");
        }
        a.close();
    }

    public static int min(int[] g) {
        int f = g[0];
        for (int i = 1; i < g.length; i++) {
            if (g[i] < f) {
                f = g[i];
            }
        }
        return f;
    }

    public static int max(int[] h) {
        int m = h[0];
        for (int i = 1; i < h.length; i++) {
            if (h[i] > m) {
                m = h[i];
            }
        }
        return m;
    }

    public static double median(int[] z) {
        int length = z.length;
        if (length % 2 == 0) {
            return (z[length / 2] + z[length / 2 - 1]) / 2.0;
        } else {
            return z[length / 2];
        }
    }

    public static double standardDeviation(int[] z) {
        double y = w(z);
        double r = 0;
        for (int i = 0; i < z.length; i++) {
            double w = z[i] - y;
            r += w * w;
        }
        return Math.sqrt(r / (z.length - 1));
    }

    public static double w(int[] z) {
        double sum = 0;
        for (int i = 0; i < z.length; i++) {
            sum += z[i];
        }
        return sum / z.length;
    }
}
