import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println((n & 1) == 0 ? "Even" : "Odd"); // here is the number 1 with & is called a bitmask
        /*
         * here by doing & with 1, we changed all the bits to 0 other than the LSB
         * (least significant bit) as it will tell us whether the number is odd or
         * even
         */
    }
}
