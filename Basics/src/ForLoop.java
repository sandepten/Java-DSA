import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // Printing prime numbers
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 3; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.print(i + " ");
            }
        }
    }
}
