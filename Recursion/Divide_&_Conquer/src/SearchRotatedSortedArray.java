//? sorted, rotated array with distinct numbers (in ascending order). It is rotated at some pivot unknown to you beforehand. Fint the index of given element.
public class SearchRotatedSortedArray {
    public static int search(int arr[], int target, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2; // or (si/ei)/2

        // ! Now we need to handle the different cases
        // case found
        if (arr[mid] == target) {
            return mid;
        }
        // mid on line 1
        if (arr[si] <= arr[mid]) {
            // case a -> left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            }
            // case b -> right
            else {
                return search(arr, target, mid + 1, ei);
            }
        }
        // mid on line 2
        else {
            // case c -> right
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            // case d -> left
            else {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        // TODO: write this in iteration form and also complete the questions on the
        // divide and conquer chapter
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
}
