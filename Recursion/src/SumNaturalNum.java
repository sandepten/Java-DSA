public class SumNaturalNum {
    public static int sumFirstNaturalNum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumFirstNaturalNum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumFirstNaturalNum(100));
    }
}
