//? Given a balanced expression, find if it contains duplicate parentheses or not. A set of parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.
// Return true if it contains duplicates
// (((a+(b)))+(c+d)) - true
// ((a+b)+(c+d)) - false

import java.util.Stack;

public class DuplicateParenthesis {
  public static boolean findDuplicateParenthesis(String s) {
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch != ')') {
        st.push(ch);
      } else {
        int count = 0;
        while (!st.isEmpty()) {
          if (st.peek() == '(') {
            if (count == 0) {
              return true;
            }
            st.pop();
            break;
          }
          st.pop();
          count++;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String s = "(((a+b)+(c+d)))";
    System.out.println(findDuplicateParenthesis(s));
  }
}
