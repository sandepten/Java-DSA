public class SetIthBit {
    public static int setIthBit(int n, int i) {
        return n | (1 << i);
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
}
