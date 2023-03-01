public class DuplicatesInString {
    public static String removeDuplicates(String s, boolean[] alphabet, int i) {
        if (i == s.length()) {
            return "";
        }
        char ch = s.charAt(i);
        if (alphabet[ch - 'a'] == false) {
            alphabet[ch - 'a'] = true;
            return ch + removeDuplicates(s, alphabet, i + 1);
        }
        return removeDuplicates(s, alphabet, i + 1);
    }

    public static void main(String[] args) {
        String s = "ssseandeep";
        boolean aplhabet[] = new boolean[26];
        System.out.println(removeDuplicates(s, aplhabet, 0));
    }
}
