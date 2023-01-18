import java.util.Scanner;

public class Q_ReverseNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n > 0) {
            System.out.print(n % 10);
            n = n / 10;
        }
    }
}
