import java.util.ArrayList;

public class ArrayImpl {
  public static class Queue {
    ArrayList<Integer> arr = new ArrayList<>();

    public static int rear = -1;

    public void add(int n) {
      arr.add(n);
      rear++;
    }

    public int remove() {
      if (arr.isEmpty()) {
        return -1;
      }
      rear--;
      return arr.remove(0);
    }

    public int peek() {
      if (arr.isEmpty()) {
        return -1;
      }
      return arr.get(0);
    }

    public boolean isEmpty() {
      return arr.isEmpty();
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
    // System.out.println(q.peek());
    // System.out.println(q.remove());
    // System.out.println(q.peek());
  }
}
