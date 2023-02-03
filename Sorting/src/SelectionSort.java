import java.util.Scanner;

public class SelectionSort {
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

    public static int[] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smNo = i;
            boolean isSorted = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smNo]) {
                    smNo = j;
                    isSorted = false;
                }
            }
            if (isSorted) {
                return arr;
            }
            int temp = arr[i];
            arr[i] = arr[smNo];
            arr[smNo] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = inputArray(s);
        printArray(selectionSort(arr));
    }
}
