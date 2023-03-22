public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            // this comparison is the same we used for check if the LSB is odd or even
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(10));
    }
}
