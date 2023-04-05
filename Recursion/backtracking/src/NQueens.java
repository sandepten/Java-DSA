import java.util.Scanner;

public class NQueens {
    public static void boardInitialization(char board[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
    }

    public static void printBoard(char board[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void nQueens(char board[][], int n) {

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char board[][] = new char[n][n];
        boardInitialization(board, n);
        printBoard(board, n);
    }
}
