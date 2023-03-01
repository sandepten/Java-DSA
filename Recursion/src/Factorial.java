public class Factorial {
    public static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}
