import java.util.Stack;

public class ReverseString {
  public static String reverseStringStack(String str) {
    Stack<Character> s = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      s.push(str.charAt(i));
    }
    StringBuilder finalStr = new StringBuilder();
    while (!s.isEmpty()) {
      finalStr.append(s.pop());
    }
    return finalStr.toString();
  }

  public static void main(String[] args) {
    String str = "My name is Sandeep";
    System.out.println(reverseStringStack(str));
  }
}
