//? For given n lines on x-axis, use two lines to form a container such that it holds the maximum water. height=[1, 8, 6, 2, 5, 4, 8, 3, 7]

public class ContainerWithMostWater {
    public static int[] findContainerWithMostWater(int[] heights) {
        int[] ans = new int[2];
        int maxVol = 0;
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                int currVol = Math.min(heights[i], heights[j]) * (j - i);
                if (currVol > maxVol) {
                    maxVol = currVol;
                    ans[1] = j;
                    ans[0] = i;
                }
            }
        }
        System.out.println("Max vol: " + maxVol);
        return ans;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] ans = findContainerWithMostWater(height);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

// public static int[] findContainerWithMostWater(int[] heights) {
// int[] ans = new int[2];
// int diff = Integer.MIN_VALUE;
// for (int i = 0; i < heights.length - 2; i++) {
// int line1 = heights[i];
// int line2 = heights[i + 1];
// int total = (line1 + line2)
// - (Math.max(line1, line2) - Math.min(line1, line2));
// if (total > diff) {
// diff = total;
// ans[0] = line1;
// ans[1] = line2;
// }
// }
// return ans;
// }
