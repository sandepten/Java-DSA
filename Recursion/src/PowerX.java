import java.util.Scanner;

public class PowerX {
    public static int power(int x, int p) {
        if (p == 1)
            return x;
        return x * power(x, p - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int p = s.nextInt();
        System.out.println(power(x, p));
    }
}
