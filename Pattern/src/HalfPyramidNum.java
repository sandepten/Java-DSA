import java.util.Scanner;

public class HalfPyramidNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
