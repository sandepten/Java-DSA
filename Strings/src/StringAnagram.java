import java.util.Scanner;

public class StringAnagram {
    public static boolean ifAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            boolean checkAnagram = false;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    checkAnagram = true;
                }
            }
            if (!checkAnagram)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        System.out.println(ifAnagram(s1, s2));
    }
}
