//! This is a really important question, as the concept is used in other questions
// The next greater element of some element x in an array is the first greater element that is to the right of x in the same array
// arr = [6, 8, 0, 1, 3]
// next greater = [8, -1, 1, 3, -1]

import java.util.Stack;

public class NextGreater {
  public static int[] findNextGreater(int arr[]) {
    int ans[] = new int[arr.length];

    // ? This is a brute force approch, which has a time complexity of O(n^2)
    // for (int i = 0; i < arr.length; i++) {
    // int nextGreaterElement = -1;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[j] > arr[i]) {
    // nextGreaterElement = arr[j];
    // break;
    // }
    // }
    // ans[i] = nextGreaterElement;
    // }

    // ? This is a better approach O(n) which uses stack
    Stack<Integer> s = new Stack<>();
    for (int i = arr.length - 1; i >= 0; i--) {
      while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        s.pop(); // this removes the elements which are smaller than the current element because
                 // if the other elements on the right are smaller then the currect element will
                 // the greater number for the elements on the left.
      }
      ans[i] = s.isEmpty() ? -1 : arr[s.peek()];
      s.push(i);
    }
    return ans;
  }

  // ? There are multiple variants of this question like, Next greater right, next
  // greater left, Next smallest left and right

  public static void main(String[] args) {
    int arr[] = { 6, 8, 0, 1, 3 };
    int ans[] = findNextGreater(arr);
    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i] + " ");
    }
  }
}
