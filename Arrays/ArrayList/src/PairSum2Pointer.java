import java.util.ArrayList;

public class PairSum2Pointer {
  // I love two pointers, they make time complexity so much better than having two
  // nested for loops
  public static void findPairSum(ArrayList<Integer> nums, int target) {
    int lp = 0;
    int rp = nums.size() - 1;
    while (lp < rp) {
      if (nums.get(lp) + nums.get(rp) == target) {
        System.out.println(lp + " " + rp);
        return;
      } else if (nums.get(lp) + nums.get(rp) < target) {
        lp++;
      } else {
        rp--;
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
    findPairSum(nums, 4);
  }
}
