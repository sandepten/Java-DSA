import java.util.Stack;

public class JCFImpl {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    System.out.println("Top: " + s.peek());
    s.pop();
    System.out.println("Top: " + s.peek());
    while (!s.isEmpty()) {
      System.out.print(s.peek() + " ");
      s.pop();
    }
  }
}
