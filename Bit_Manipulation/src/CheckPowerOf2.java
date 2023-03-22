public class CheckPowerOf2 {
    public static boolean checkPowerOf2(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(i + " " + checkPowerOf2(i));
        }
    }
}
