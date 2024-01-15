public class exo2 {
    public static void main(String[] args) {
        System.out.println(nextPrimeNumber(64));
        System.out.println(previousPrimeNumber(0));
    }

    private static boolean isPrimeNumber (int n) {
        double c = Math.sqrt(n);
        return n % c == 0;
    }
    private static int nextPrimeNumber(int n) {
        System.out.println("Next Prime Number of " + n);
        int result = 0;
        int i = n+1;

        while (result == 0) {
            if (isPrimeNumber(i)) {
                result = i;
            }
            i++;
        }

        return result;
    }

    private static int previousPrimeNumber(int n) {
        System.out.println("Previous Prime Number of " + n);
        int result = n;
        int i = n-1;

        if (n == 0) {
            return 0;
        }

        while (result == n) {
            if (isPrimeNumber(i)) {
                result = i;
            }
            i--;
        }

        return result;
    }
}
