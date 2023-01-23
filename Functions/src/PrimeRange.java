import java.util.Scanner;

public class PrimeRange {
    public static boolean ifPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeRangePrint(int a) {
        for (int i = 2; i <= a; i++) {
            if (ifPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        primeRangePrint(n);
    }
}
