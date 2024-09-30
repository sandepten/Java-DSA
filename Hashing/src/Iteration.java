import java.util.HashMap;
import java.util.Set;

public class Iteration {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> population = new HashMap<>();

        population.put("India", 200);
        population.put("USA", 50);
        population.put("China", 180);

        Set<String> keys = population.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + population.get(key));
        }
    }
}
