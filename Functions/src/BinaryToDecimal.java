import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimal(int a) {
        int decNo = 0;
        int i = 0;
        while (a > 0) {
            decNo += (a % 10) * ((int) (Math.pow(2, i)));
            a /= 10;
            i++;
        }
        return decNo;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int binNo = s.nextInt();
        System.out.println(binaryToDecimal(binNo));
    }
}
