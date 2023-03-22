public class ClearLastIBits {
    public static int clearLastIBits(int n, int i) {
        // here the bitmask is -1<<i because we want to & with n and don't want the
        // other digits on the left to change other than the last i digits
        return n & ((-1) << i);
    }

    public static void main(String[] args) {
        System.out.println(clearLastIBits(15, 2));
    }
}
