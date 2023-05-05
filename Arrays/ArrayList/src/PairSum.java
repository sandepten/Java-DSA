// Find if any pair in a sorted ArrayList has a target sum

import java.util.ArrayList;

public class PairSum {
  public static void findPairSum(ArrayList<Integer> nums, int target) {
    for (int i = 0; i < nums.size(); i++) {
      for (int j = i + 1; j < nums.size(); j++) {
        if (nums.get(i) + nums.get(j) == target) {
          System.out.println(i + " " + j);
          return;
        }
      }
    }
    System.out.println("Not found!");
  }

  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);
    findPairSum(nums, 5);
  }
}
