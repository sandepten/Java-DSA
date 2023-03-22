public class ClearRangeBits {
    public static int clearRangeBits(int n, int i, int j) {
        int bitmask = (1 << i - 1) | ((~0) << j + 1);
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearRangeBits(10, 2, 4));
    }
}
