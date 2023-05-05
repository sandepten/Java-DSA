import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> rollNo = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        rollNo.add(21);
        rollNo.add(35);
        rollNo.add(40);
        rollNo.add(2, 66);
        System.out.println(rollNo);
        System.out.println(rollNo.get(1));
        rollNo.remove(1);
        System.out.println(rollNo);
        System.out.println(rollNo.contains(21));
    }
}
