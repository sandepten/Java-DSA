public class FastExponentiation {
    // By using bit manipulation to find the exponent of a number we can reduce the
    // time complexity from O(n) to O(log n)
    public static int fastExponents(int n, int p) {
        int ans = 1;

        while (p > 0) {
            if ((p & 1) != 0) {
                ans *= n;
            }
            n *= n;
            p = p >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExponents(5, 3));
    }
}
