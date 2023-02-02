import java.util.Scanner;

public class KadaneAlgo {
    public static int[] inputArray(Scanner s) {
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int maxSubarraySumKadaneAlgorithm(int arr[]) {
        int max_sum = Integer.MIN_VALUE;
        int curSum = 0;
        int minNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curSum = (curSum + arr[i]) < 0 ? 0 : curSum + arr[i];
            minNum = arr[i] <= 0 ? Math.max(minNum, arr[i]) : minNum;
            max_sum = Math.max(max_sum, curSum);
        }
        return max_sum <= 0 ? minNum : max_sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = inputArray(s);
        System.out.println(maxSubarraySumKadaneAlgorithm(arr));
    }
}
