public class App {
    public static int fibonacci(int n, int f[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fibonacci(n - 1, f) + fibonacci(n - 2, f);
        return f[n];
    }

    public static void fibonacciTabulation(int n) {
        int f[] = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        System.out.println(f[n]);
    }

    public static void main(String[] args) throws Exception {
        int n = 100;
        int f[] = new int[n + 1];
        // System.out.println(fibonacci(n, f));
        fibonacciTabulation(n);
    }
}
