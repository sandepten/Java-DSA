import java.util.Scanner;

public class StaircaseSearch {
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

    public static boolean staircaseSearch(int arr[][], int key) {
        int row = arr.length - 1;
        int col = 0;
        while (row >= 0 && col < arr[0].length) {
            int currVal = arr[row][col];
            if (currVal == key) {
                return true;
            }
            if (key > currVal) {
                col++;
            } else {
                row--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] = input2DArray(s);
        int key = s.nextInt();
        System.out.println(staircaseSearch(arr, key));
    }
}
