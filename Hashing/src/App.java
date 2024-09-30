import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> population = new HashMap<>();

        // insert - O(1)
        population.put("India", 200);
        population.put("USA", 50);

        // get - O(1)
        population.get("India");
        // if a key does not exists then it returns a null

        // containsKey - O(1)
        // checks if a key exists in a map
        population.containsKey("India");

        // delete - O(1)
        population.remove("India");

        // size
        population.size();

        // clear
        population.clear();
    }
}
