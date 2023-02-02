import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int arr[] = new int[10];
        // String names[] = { "Sandeep", "Sanjana", "Shivani" };
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        // taking the input in Array
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        // printing the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
