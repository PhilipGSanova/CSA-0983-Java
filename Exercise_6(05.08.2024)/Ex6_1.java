import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex6_1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Apple","Green");
        map.put("Cherry", "Red");
        map.put("Banana", "Yellow");

        System.out.println("Initial HashMap: " + map);

        // Get a value associated with a key
        String colorOfApple = map.get("Apple");
        System.out.println("Color of Alice: " + colorOfApple);

        // Update an entry
        map.put("Apple", "Red");
        System.out.println("Updated HashMap: " + map);

        // Remove an entry
        map.remove("Banana");
        System.out.println("HashMap after removing Banana: " + map);

        // Check if a key exists
        boolean hasCherry = map.containsKey("Cherry");
        System.out.println("Contains Cherry? " + hasCherry);

        // Check if a value exists
        boolean hasValueBlue = map.containsValue("Blue");
        System.out.println("Contains value Blue? " + hasValueBlue);

        // Get the size of the HashMap
        int size = map.size();
        System.out.println("Size of HashMap: " + size);

        // Iterate over HashMap entries using keySet
        System.out.println("Iterating using keySet:");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Iterate over HashMap entries using entrySet
        System.out.println("Iterating using entrySet:");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Clear all entries
        map.clear();
        System.out.println("HashMap after clearing: " + map);
    }
}
