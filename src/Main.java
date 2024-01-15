public class Main {
    public static void main(String[] args) {
        System.out.println("Boucle FOR");

        for (int i = 1; i <= 100; i++) {
            System.out.println("i = " + i);
        }
        enumerate_while(250);
        enumerate_even(150);
    }

    private static void enumerate_while(int max){
        System.out.println("Boucle WHILE");
        int i = 0;
        while (i <= max) {
            System.out.println("i = " + i);
            i++;
        }
    }

    private static void enumerate_even(int max) {
        System.out.println("Boucle FOR - print even numbers");

        for (int i = 0; i <= max; i++) {
            if (i%2 == 0) {
                System.out.println("i = " + i);
            }
        }
    }
}