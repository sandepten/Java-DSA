import java.util.Scanner;

public class SpiralMatrix {
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

    public static void printSpiralMatrix(int arr[][]) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startColumn = 0;
        int endColumn = arr[0].length - 1;
        while (startRow <= endRow && startColumn <= endColumn) {
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endColumn] + " ");
            }
            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }
            for (int i = endRow - 1; i > startRow; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(arr[i][startColumn] + " ");
            }
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] = input2DArray(s);
        printSpiralMatrix(arr);
    }
}
