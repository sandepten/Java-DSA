public class StringSubsets {
    // total number of subsets present in a given string of length n is 2^n
    public static void printStringSubsets(String s, String ans, int i) {
        if (i == s.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        printStringSubsets(s, ans + s.charAt(i), i + 1);
        printStringSubsets(s, ans, i + 1);
    }

    public static void main(String[] args) {
        String s = "abc";
        printStringSubsets(s, "", 0);
    }
}
