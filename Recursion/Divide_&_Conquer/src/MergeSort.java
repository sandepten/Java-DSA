public class MergeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // write the merge sort algorithm with recursion
    public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // public static void merge(int arr[], int si, int mid, int ei) {
    // int temp[] = new int[ei - si + 1];
    // int i = si; // iterator for left part
    // int j = mid + 1; // iterator for right part
    // int k = 0; // iterator for temp arr

    // while (i <= mid && j <= ei) {
    // if (arr[i] < arr[j]) {
    // temp[k] = arr[i];
    // i++;
    // } else {
    // temp[k] = arr[j];
    // j++;
    // }
    // k++;
    // }
    // // after completing the above loop, if either the left or the right parts of
    // the
    // // array will have values then the below loops will run
    // while (i <= mid) {
    // temp[k++] = arr[i++];
    // }
    // while (j <= ei) {
    // temp[k++] = arr[j++];
    // }

    // // copy temp to original arr
    // for (k = 0, i = si; k < temp.length; k++, i++) {
    // arr[i] = temp[k];
    // }
    // }

    // public static void mergeSort(int arr[], int si, int ei) {
    // if (si >= ei) {
    // return;
    // }
    // int mid = si + (ei - si) / 2; // (si+ei)/2
    // mergeSort(arr, si, mid); // left part
    // mergeSort(arr, mid + 1, ei); // right part
    // merge(arr, si, mid, ei);
    // }
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
