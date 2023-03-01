public class BubbleSortRecursion {
    public static boolean checkSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return checkSorted(arr, i + 1);
    }

    public static void bubbleSort(int arr[], int i) {

    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 7, 5, 9, 2 };

    }
}
