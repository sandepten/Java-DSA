import java.util.Scanner;

public class TransposeMatrix {
    public static int[][] input2DArray(Scanner s) {
        int n = s.nextInt();
        int m = s.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    public static int[][] transposeMatrix(int arr[][]) {
        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] = input2DArray(s);
        System.out.println(transposeMatrix(arr));
    }
}
