public class BacktrackingArray {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void backtrackArray(int arr[], int i) {
        if (i == arr.length) {
            printArray(arr);
            return;
        }
        arr[i] = i + 1;
        backtrackArray(arr, i + 1);
        arr[i] = arr[i] - 2;
        return;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        backtrackArray(arr, 0);
        printArray(arr);
    }
}
