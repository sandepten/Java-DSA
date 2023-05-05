import java.util.ArrayList;

public class PairSumRotated {
  public static void findPairSum(ArrayList<Integer> nums, int target) {
    int lp = 0;
    int rp = nums.size() - 1;

    // This is to get the breaking point
    for (int i = 0; i < nums.size() - 1; i++) {
      if (nums.get(i) > nums.get(i + 1)) {
        lp = i + 1;
        rp = i;
        break;
      }
    }

    while (lp != rp) {
      if (nums.get(lp) + nums.get(rp) == target) {
        System.out.println(lp + " " + rp);
        return;
      } else if (nums.get(lp) + nums.get(rp) < target) {
        lp++;
        if (lp == nums.size()) {
          lp = 0;
        }
        // ! Another way of doing this will by by modular arithmatic
        // lp = (lp + 1) % (nums.size());
      } else {
        rp--;
        if (rp == -1) {
          rp = nums.size() - 1;
        }
        // ! Another way of doing this will by by modular arithmatic
        // rp = (nums.size() + rp - 1) % (nums.size());
      }
    }
    System.out.println("Not found!");
  }

  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(11);
    nums.add(15);
    nums.add(6);
    nums.add(8);
    nums.add(9);
    nums.add(10);
    findPairSum(nums, 16);
  }
}
