public class FloydTriangle {
    public static void floydTrianglePrint(int n) {
        int printNum = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++, printNum++) {
                System.out.print(printNum + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floydTrianglePrint(5);
    }
}
