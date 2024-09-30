import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(3);
        set.add(6);
        set.add(23);
        // Duplicate elements are not allowed
        set.add(1);

        // iteration using iterators
        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // iteration using for-each loop
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
