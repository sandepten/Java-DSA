import java.util.ArrayList;

public class TwoDimensionalList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> bigList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(9);

        bigList.add(list);
        bigList.add(list2);
        System.out.println(bigList);
    }
}
