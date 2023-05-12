public class LinkedListImpl {
  public static class Stack {
    static Node head = null;

    static class Node {
      int data;
      Node next;

      public Node(int data) {
        this.data = data;
        this.next = null;
      }
    }

    public void push(int data) {
      Node newHead = new Node(data);
      if (isEmpty()) {
        head = newHead;
        return;
      }
      newHead.next = head;
      head = newHead;
    }

    public int pop() {
      if (isEmpty()) {
        return -1;
      }
      int oldTop = head.data;
      head = head.next;
      return oldTop;
    }

    public int peek() {
      if (isEmpty()) {
        return -1;
      }
      return head.data;
    }

    public boolean isEmpty() {
      return head == null;
    }
  }

  public static void main(String[] args) {
    Stack s = new Stack();
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
