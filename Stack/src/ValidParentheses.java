//? Given a string containing just the characters '(',')','{','}','['and']' determine if the input string is valid
// valid conditions
// Open brackets must be closed by the same type of brackets
// Open brackets must be closed in the correct order
// Every close bracket has a corresponding open bracket of the same type

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
  public static boolean parenthesesValidator(String s) {
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '(' || ch == '{' || ch == '[') {
        st.push(ch);
      } else if (ch == ')') {
        if (st.isEmpty() || st.peek() != '(') {
          return false;
        } else {
          st.pop();
        }
      } else if (ch == '}') {
        if (st.isEmpty() || st.peek() != '{') {
          return false;
        } else {
          st.pop();
        }
      } else if (ch == ']') {
        if (st.isEmpty() || st.peek() != '[') {
          return false;
        } else {
          st.pop();
        }
      }
    }
    return st.isEmpty();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(parenthesesValidator(s));
  }
}
