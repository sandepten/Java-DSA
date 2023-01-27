public class HollowRectangle {
    public static void hollowRectanglePrint(int rows, int col) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || j == 1 || i == rows || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectanglePrint(6, 15);
    }
}
