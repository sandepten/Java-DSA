import java.util.Stack;

public class PushAtBottom {
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

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    pushAtBottom(s, 5);
    while (!s.empty()) {
      System.out.print(s.pop() + " ");
    }
  }
}
