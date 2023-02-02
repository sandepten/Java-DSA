import java.util.Scanner;

public class MaxSubarraySumPrefix {
    public static int[] inputArray(Scanner s) {
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int maxSubarraySumPrefix(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        int prefixArr[] = new int[arr.length];
        prefixArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < prefixArr.length; j++) {
                max_sum = Math.max(max_sum, i == 0 ? prefixArr[j] : (prefixArr[j] - prefixArr[i - 1]));
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = inputArray(s);
        System.out.println(maxSubarraySumPrefix(arr));
    }
}
