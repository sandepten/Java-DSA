public class LargestString {
    public static String largestString(String arr[]) {
        String maxString = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxString.compareTo(arr[i]) < 0) {
                maxString = arr[i];
            }
        }
        return maxString;
    }

    public static void main(String[] args) {
        String arr[] = { "Sandeep", "Sanjana", "Shivani" };
        System.out.println(largestString(arr));
    }
}
