import java.util.Scanner;

public class PrintNumDes {
    public static void printDescNum(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        printDescNum(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        printDescNum(s.nextInt());
    }
}
