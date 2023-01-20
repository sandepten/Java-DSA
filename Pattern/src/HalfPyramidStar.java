import java.util.Scanner;

public class HalfPyramidStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
