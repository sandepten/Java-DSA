public class continueKeywordLoops {
    public static void main(String[] args) {
        int n = 10;
        int i = 0;
        while (i <= 10) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        }
    }
}
