import java.util.Scanner;

public class MaxSubarraySumBrute {
    public static int[] inputArray(Scanner s) {
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printSubArrays(int arr[]) {
        int min_sum = Integer.MAX_VALUE;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                min_sum = Math.min(min_sum, currSum);
                max_sum = Math.max(max_sum, currSum);
            }
        }
        System.out.println("Max Subarray sum: " + max_sum);
        System.out.println("Min Subarray sum: " + min_sum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = inputArray(s);
        printSubArrays(arr);
    }
}
