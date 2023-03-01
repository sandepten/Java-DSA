public class TilingProblem {
    public static int tilingRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // Vertical case
        int fnm1 = tilingRecursion(n - 1);
        // Horizontal case
        int fnm2 = tilingRecursion(n - 2);

        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println(tilingRecursion(4));
    }
}
