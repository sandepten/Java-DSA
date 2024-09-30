// find the shortest unique prefix for every word in a given list

public class Prefix {
    static class Node {
        Node children[] = new Node[26];
        boolean isEndOfWord;
        int frequency;

        Node() {
            isEndOfWord = false;
            frequency = 1;
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
            } else {
                curr.children[index].frequency++;
            }
            curr = curr.children[index];
        }
        curr.isEndOfWord = true;
    }

    public static String shortPrefixFinder(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.frequency == 1) {
                return key.substring(0, i);

            }
            curr = curr.children[index];
        }
        return key;
    }

    public static void main(String[] args) throws Exception {
        String words[] = { "zebra", "dog", "duck", "dove" };

        for (String word : words) {
            insert(word);
        }
        root.frequency = -1;

        // prefix
        for (int i = 0; i < words.length; i++) {
            String prefix = shortPrefixFinder(words[i]);
            System.out.print(prefix + " ");
        }
        System.out.println();
    }
}
