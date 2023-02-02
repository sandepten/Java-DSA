import java.util.Scanner;

public class LargestInArray {
    public static int[] inputArray(Scanner s) {
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int largestNumInArray(int arr[]) {
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxNum = Math.max(maxNum, arr[i]);
        }
        return maxNum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = inputArray(s);
        System.out.println(largestNumInArray(arr));
    }
}
