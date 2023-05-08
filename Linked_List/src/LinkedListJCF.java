import java.util.LinkedList;

public class LinkedListJCF {
  public static void main(String[] args) {
    // create
    LinkedList<Integer> ll = new LinkedList<>();

    ll.addFirst(1);
    ll.addLast(3);
    ll.add(1, 2);

    ll.removeFirst();

    System.out.println(ll);
  }
}
