import java.util.Stack;

public class ReverseStack {
  // public static Stack<Integer> reverseStack(Stack<Integer> s) {
  // Stack<Integer> newS = new Stack<>();
  // while (!s.isEmpty()) {
  // newS.push(s.pop());
  // }
  // return newS;
  // }
  public static void pushAtBottom(Stack<Integer> s, int data) {
    if (s.isEmpty()) {
      s.push(data);
      return;
    }
    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);
    return;
  }

  public static void reverseStack(Stack<Integer> s) {
    if (s.isEmpty()) {
      return;
    }
    int top = s.pop();
    reverseStack(s);
    pushAtBottom(s, top);
    return;
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    reverseStack(s);
    while (!s.isEmpty()) {
      System.out.print(s.pop() + " ");
    }
  }
}
