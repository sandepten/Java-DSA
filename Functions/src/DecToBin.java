import java.util.Scanner;

public class DecToBin {
    public static String decToBin(int a) {
        String binNo = "";
        while (a > 0) {
            binNo += a % 2;
            a /= 2;
        }
        String revStr = new StringBuilder(binNo).reverse().toString();
        return revStr;
    }

    public static int decToBinApnaCollege(int a) {
        int binNo = 0;
        int power = 0;
        while (a > 0) {
            binNo += (a % 2) * ((int) (Math.pow(10, power)));
            a /= 2;
            power++;
        }
        return binNo;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int decNo = s.nextInt();
        // System.out.println(decToBin(decNo));
        System.out.println(decToBinApnaCollege(decNo));
    }
}
