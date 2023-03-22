public class UpdateIthBit {
    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return n & (~(1 << i));
        } else {
            return n | (1 << i);
        }
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
