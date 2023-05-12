import java.util.ArrayList;

public class ArrayListImpl {
  public static class StackAL {
    public static int top = -1;
    ArrayList<Integer> stack = new ArrayList<>();

    public void push(int data) {
      stack.add(data);
      top++;
    }

    public int pop() {
      if (isEmpty()) {
        return -1;
      }
      return stack.remove(--top);
    }

    public int peek() {
      if (isEmpty()) {
        return -1;
      }
      return stack.get(top);
    }

    public boolean isEmpty() {
      return stack.isEmpty();
    }

    public void print() {
      for (int i = 0; i < stack.size(); i++) {
        System.out.print(stack.get(i) + " ");
      }
    }
  }

  public static void main(String[] args) {
    StackAL stack = new StackAL();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(3);
    System.out.println(stack.peek());
    stack.pop();
    stack.print();
  }
}
