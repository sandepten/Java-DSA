// Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated sequence of dictionary words.

public class WordBreak {
    static class Node {
        Node children[] = new Node[26];
        boolean isEndOfWord;

        Node() {
            isEndOfWord = false;
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.isEndOfWord = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return curr != null && curr.isEndOfWord;
    }

    public static boolean wordBreakChecker(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 0; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreakChecker(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        String words[] = { "i", "like", "sam", "samsung", "mobile", "ice" };

        for (String word : words) {
            insert(word);
        }

        String key = "ilikesamsung";
        System.out.println(wordBreakChecker(key));
    }
}
