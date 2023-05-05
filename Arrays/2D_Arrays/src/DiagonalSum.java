import java.util.Scanner;

public class DiagonalSum {
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

    public static int diagonalSum(int arr[][]) {
        int sum = 0;
        boolean isOdd = arr.length % 2 == 0 ? false : true;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i] + arr[i][arr.length - 1 - i];
        }
        return isOdd ? sum - arr[arr.length / 2][arr.length / 2] : sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] = input2DArray(s);
        System.out.println(diagonalSum(arr));
    }
}
