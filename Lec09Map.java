
import java.util.HashMap;
import java.util.Map;

public class Lec09Map {
    public static void main(String[] args) {
        // Map Interface -> HashMap, TreeMap, EnumMap, LinkedHashMap, WeakHashMap

        Map<String, Integer> numbers = new HashMap<>();
        // Map<String, Integer> numbers = new TreeMap<>();
        // Implements using BST. Get sorted using key value.
        // Time complexity - O(log(N))
        
        // #1: To insert key value pair
        numbers.put("One", 1);
        numbers.put("Two", 5);
        numbers.put("Three",3);
        numbers.put("Four", 4);
        System.out.println(numbers); // {One=1, Four=4, Two=5, Three=3}
        numbers.put("Two", 2); // Replaces 2's value
        System.out.println(numbers); // {One=1, Four=4, Two=2, Three=3}

        // #2: Check if key exists or not
        System.out.println(numbers.containsKey("Two")); // true

        // #3: To remove a key value pair
        numbers.remove("Four");

        // #4: Insert if key doesn't exist
        if(!numbers.containsKey("Three")) {
            numbers.put("Three", 2);
        }
        // Similar thing can be achieved using putIfAbsent
        numbers.putIfAbsent("Three", 3);

        // #5: To iterate
        for(Map.Entry<String, Integer> e: numbers.entrySet()) {
            System.out.println("Entry: " + e);
            System.out.println("Key: " + e.getKey());
            System.out.println("Value: " + e.getValue());
        }

        // #6: To iterate over keys only
        for(String k: numbers.keySet()) {
            System.out.println(k);
        }

        // #7: To iterate over values only
        for(Integer v: numbers.values()) {
            System.out.println(v);
        }

        // #8: To check if set is empty or not
        if(numbers.isEmpty()) {
            System.out.println("Map is empty");
        }
        else {
            System.out.println("Map is not empty");
        }
    }
}
