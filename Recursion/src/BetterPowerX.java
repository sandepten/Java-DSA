import java.util.Scanner;

public class BetterPowerX {
    public static int power(int x, int p) {
        if (p == 1)
            return x;
        int halfPower = power(x, p / 2);
        int halfPowerSq = halfPower * halfPower;
        if (p % 2 != 0) {
            return x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int p = s.nextInt();
        System.out.println(power(x, p));
    }
}
