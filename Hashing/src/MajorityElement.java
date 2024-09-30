// given an integer array of size n, find all elements that appear more than n/3 times

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) throws Exception {
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // if (hm.containsKey(nums[i])) {
            // hm.put(nums[i], hm.get(nums[i]) + 1);
            // } else {
            // hm.put(nums[i], 1);
            // }
            // instead of doing the above if else, we have shortcut for this in maps
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer num : hm.keySet()) {
            if (hm.get(num) > (nums.length) / 3) {
                System.out.println(num);
            }
        }
    }
}
