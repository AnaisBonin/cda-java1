import java.util.Arrays;

public class exo3 {
    public static void main(String[] args) {
        System.out.println("EXO 3");
        fibo(1);
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

            System.out.println(n + " numbers of Fibonacci");
            System.out.println(Arrays.toString(fibonacciSeq));
            return fibonacciSeq;
        }
    }
}
