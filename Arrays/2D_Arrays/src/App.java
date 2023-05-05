import java.util.Scanner;

public class App {
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

    public static void print2DArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int arr[][] = input2DArray(s);
        print2DArray(arr);
    }
}
