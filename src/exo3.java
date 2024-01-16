import java.util.Arrays;

public class exo3 {
    public static void main(String[] args) {
        System.out.println("EXO 3");
        fibo(1);
        int[] result = approximation_fibo((float)0.01);
        System.out.println(Arrays.toString(result));
    }

    private static int[] fibo(int n) {
        int[] fibonacciSeq = new int[n];
        fibonacciSeq[0] = 0;

        if (n == 1) {
            return fibonacciSeq;
        } else {
            fibonacciSeq[1] = 1;
            int i = 2;
            while (i < n) {
                fibonacciSeq[i] = fibonacciSeq[i - 1] + fibonacciSeq[i - 2];
                i++;
            }
            return fibonacciSeq;
        }
    }

    private static int[] approximation_fibo(float epsilon) {
        double phi = (1 + Math.sqrt(5)) / 2;
        int[] result = new int[2];
        result[0] = 0;

        int j = 4; // We need to start comparing at 2 and 1. these values are given by fibo(4)

        while (result[0] == 0) {
            int[] currentFibo= fibo(j);
            int a = currentFibo[j - 2];
            int b = currentFibo[j - 1];
            double ratioBA = (double) b / a;
            double diff = Math.abs(ratioBA - phi);

            if (diff < epsilon) {
                result[0] = b;
                result[1] = a;
            }
            j++;
        }
        return result;
    }
}