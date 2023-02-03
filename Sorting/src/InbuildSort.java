import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class InbuildSort {
    public static Integer[] inputArray(Scanner s) {
        int n = s.nextInt();
        Integer arr[] = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer arr[] = inputArray(s);
        Arrays.sort(arr);
        printArray(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);
    }
}
