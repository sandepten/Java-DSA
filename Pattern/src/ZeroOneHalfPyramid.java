public class ZeroOneHalfPyramid {
    public static void zeroOneHalfPyramidPrint(int n) {
        int printNum = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++, printNum = printNum == 1 ? 0 : 1) {
                System.out.print(printNum + " ");
            }
            printNum = (i + 1) % 2 == 0 ? 0 : 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zeroOneHalfPyramidPrint(10);
    }
}
