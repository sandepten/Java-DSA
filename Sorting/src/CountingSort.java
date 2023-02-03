import java.util.Scanner;

public class CountingSort {
    public static int[] inputArray(Scanner s) {
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] countingSort(int arr[]) {
        int maxNo = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxNo = Math.max(maxNo, arr[i]);
        }
        int countArr[] = new int[maxNo + 1];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }
        int count = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] > 0) {
                arr[count] = i;
                count++;
                countArr[i]--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = inputArray(s);
        printArray(countingSort(arr));
    }
}
