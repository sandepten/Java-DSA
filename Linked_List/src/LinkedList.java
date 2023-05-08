public class LinkedList {
  public static Node head;
  public static Node tail;
  public static int size;

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void addFirst(int data) {
    Node newHead = new Node(data);
    size++;
    if (head == null) {
      head = tail = newHead;
      return;
    }
    newHead.next = head;
    head = newHead;
  }

  public void addLast(int data) {
    Node newTail = new Node(data);
    size++;
    if (head == null) {
      head = tail = newTail;
      return;
    }
    tail.next = newTail;
    tail = newTail;
  }

  public void addInMiddle(int index, int data) {
    if (index == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    Node BeforeIndex = head.next;
    for (int i = 1; i < index - 1; i++) {
      BeforeIndex = BeforeIndex.next;
    }
    Node afterIndex = BeforeIndex.next;
    BeforeIndex.next = newNode;
    newNode.next = afterIndex;
    size++;
  }

  public void removeLast() {
    Node currNode = head;
    while (currNode.next != tail) {
      currNode = currNode.next;
    }
    currNode.next = null;
    tail = currNode;
    size--;
  }

  public void removeFirst() {
    head = head.next;
    size--;
  }

  public void removeIndex(int index) {
    if (index == 0) {
      removeFirst();
      return;
    }
    Node preNode = head;
    int currIndex = 1;
    while (index != currIndex) {
      preNode = preNode.next;
      currIndex++;
    }
    preNode.next = preNode.next.next;
    size--;
  }

  public int searchIter(int target) {
    int i = 0;
    Node currNode = head;
    while (currNode != null) {
      if (currNode.data == target) {
        return i;
      }
      currNode = currNode.next;
      i++;
    }
    return -1;
  }

  public int searchRecursion(int target, Node currNode, int i) {
    if (currNode == null) {
      return -1;
    }
    if (currNode.data == target) {
      return i;
    }
    return searchRecursion(target, currNode.next, i = i + 1);
  }

  public void reverseLinkedList() {
    Node currNode = head.next;
    head.next = null;
    tail = head;
    while (currNode != null) {
      Node tempNext = currNode.next;
      currNode.next = head;
      head = currNode;
      currNode = tempNext;
    }
  }

  public boolean checkPalindrome() {
    // if linked list is empty or only 1 node is present
    if (head == null || head.next == null) {
      return true;
    }
    // find the middle of the linked list by using fast-slow technique
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // reversing the half of the linked list
    Node currNode = slow.next;
    slow.next = null;
    Node prevNode = slow;
    while (currNode != null) {
      Node nextNode = currNode.next;
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = nextNode;
    }

    // check if both halfes are palindromic
    Node startNode = head;
    Node endNode = prevNode;
    while (startNode != null && endNode != null) {
      if (startNode.data != endNode.data) {
        return false;
      }
      startNode = startNode.next;
      endNode = endNode.next;
    }
    return true;
  }

  public boolean detectLoopByFloydAlgo() {
    Node fast = head.next.next;
    Node slow = head.next;
    while (fast != null && fast.next != null) {
      if (fast == slow) {
        return true;
      }
      fast = fast.next.next;
      slow = slow.next;
    }
    return false;
  }

  public void removeCycle() {
    // detecting the loop (couldn't use the detect loop function because fast and
    // slow positions are needed)
    Node fast = head.next.next;
    Node slow = head.next;
    boolean isLoop = false;
    while (fast != null && fast.next != null) {
      if (fast == slow) {
        isLoop = true;
        break;
      }
      fast = fast.next.next;
      slow = slow.next;
    }
    if (!isLoop) {
      System.out.println("No loop detected");
      return;
    }
    // Now we set slow at head and both slow and fast move at +1 speed, and will
    // meet at the node where the loop occurs, then we fix it by changing the last
    // node's next to null
    slow = head;
    while (slow.next != fast.next) {
      slow = slow.next;
      fast = fast.next;
    }
    fast.next = null;
    return;
  }

  public void zigZag() {
    // find the mid
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    // reverse the second half
    Node currNode = slow.next;
    slow.next = null;
    Node prevNode = slow;
    while (currNode != null) {
      Node nextNode = currNode.next;
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = nextNode;
    }
    // create the zig zag pattern
    Node start = head;
    Node end = prevNode;
    while (end != null && start != null) {
      Node afterStart = start.next;
      Node afterEnd = end.next;
      start.next = end;
      end.next = afterStart;
      end = afterEnd;
      start = afterStart;
      if (start != null)
        start.next = end;
    }
  }

  public void printLinkedList() {
    Node currNode = head;
    while (currNode != null) {
      System.out.print(currNode.data + " ");
      currNode = currNode.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    // ll.addFirst(1);
    // ll.addLast(1);
    // ll.addFirst(1);
    // ll.addLast(0);
    // ll.addInMiddle(2, 8);
    // ll.removeIndex(1);
    // System.out.println(ll.searchIter(5));
    // System.out.println(ll.searchRecursion(3, head, 0));
    // ll.reverseLinkedList();
    // System.out.println(ll.checkPalindrome());
    // ? create a cycle
    // tail.next = head.next.next;
    // System.out.println(ll.detectLoopByFloydAlgo());
    // ll.removeCycle();

    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(6);
    // ll.addLast(7);
    ll.zigZag();
    ll.printLinkedList();
  }
}
