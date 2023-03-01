public class FirstOccArray {
    public static int findOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return findOcc(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 9, 5, 8, 9, 11, 15 };
        System.out.println(findOcc(arr, 9, 0));
    }
}
