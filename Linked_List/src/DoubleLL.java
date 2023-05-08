public class DoubleLL {
  public static Node head;
  public static Node tail;
  public static int size;

  public static class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  public void add(int data) {
    Node newNode = new Node(data);
    if (size == 0) {
      head = newNode;
      tail = newNode;
      size++;
      return;
    }
    Node lastNode = head;
    while (lastNode.next != null) {
      lastNode = lastNode.next;
    }
    lastNode.next = newNode;
    newNode.prev = lastNode;
    size++;
  }

  public void remove() {
    Node secondLastNode = head;
    while (secondLastNode.next.next != null) {
      secondLastNode = secondLastNode.next;
    }
    secondLastNode.next = null;
    size--;
  }

  public void print() {
    Node currNode = head;
    while (currNode != null) {
      System.out.print(currNode.data + " ");
      currNode = currNode.next;
    }
  }

  public void reverse() {
    // TODO: do this
  }

  public static void main(String[] args) {
    DoubleLL dll = new DoubleLL();
    dll.add(1);
    dll.add(2);
    dll.add(3);
    dll.add(4);
    dll.remove();
    dll.print();
  }
}
