package search;

import java.util.Scanner;

public class BinarySearch {
    public static int[] inputArray(Scanner s) {
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static boolean binarySearch(int arr[], int key) {
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = inputArray(s);
        int key = s.nextInt();
        System.out.println(binarySearch(arr, key));
    }
}
