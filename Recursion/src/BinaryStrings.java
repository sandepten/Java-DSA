// Print all binary strings of size N without consecutive ones
public class BinaryStrings {
    public static void printBinaryStrings(int n, int lastPlace, String s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        printBinaryStrings(n - 1, 0, s + "0");
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, s + "1");
        }
    }

    public static void main(String[] args) {
        printBinaryStrings(5, 0, "");
    }
}
