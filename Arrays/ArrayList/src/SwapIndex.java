import java.util.ArrayList;
import java.util.Collections;

public class SwapIndex {
    public static void swapNum(ArrayList<Integer> list, int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println(list);
        swapNum(list, 1, 3);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
