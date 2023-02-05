import java.util.Scanner;

public class StringCompression {
    public static String stringCompression(String str) {
        StringBuilder sb = new StringBuilder("");
        char c = str.charAt(0);
        Integer count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            } else {
                sb.append(c + (count.toString()));
                c = str.charAt(i);
                count = 1;
            }
        }
        sb.append(c + (count.toString()));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(stringCompression(str));
    }
}
