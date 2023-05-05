import java.util.ArrayList;

public class ContainerWithMostWater2Pointer {
  // this will have the time complexity of O(n) because the distance travelled in
  // the while loop can only be the size of the array list
  public static int findContainerWithMostWater(ArrayList<Integer> waterHeights) {
    int lp = 0;
    int rp = waterHeights.size() - 1;
    int maxWater = 0;
    while (lp < rp) {
      int currVol = Math.min(waterHeights.get(lp), waterHeights.get(rp)) * (rp - lp);
      maxWater = Math.max(maxWater, currVol);

      // updating the pointers
      if (waterHeights.get(lp) < waterHeights.get(rp)) {
        lp++;
      } else {
        rp--;
      }
    }
    return maxWater;
  }

  public static void main(String[] args) {
    // int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    ArrayList<Integer> waterHeights = new ArrayList<>();
    waterHeights.add(1);
    waterHeights.add(8);
    waterHeights.add(6);
    waterHeights.add(2);
    waterHeights.add(5);
    waterHeights.add(4);
    waterHeights.add(8);
    waterHeights.add(3);
    waterHeights.add(7);
    System.out.println(findContainerWithMostWater(waterHeights));
  }
}
