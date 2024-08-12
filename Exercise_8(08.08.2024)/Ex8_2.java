/* write a java program to search a key in tree map */
import java.util.TreeMap;

public class Ex8_2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Date", 40);
        map.put("Elderberry", 50);

        String keyToSearch = "Cherry";

        if (map.containsKey(keyToSearch)) {
            System.out.println("Key \"" + keyToSearch + "\" is present in the TreeMap.");
            Integer value = map.get(keyToSearch);
            System.out.println("Value associated with key \"" + keyToSearch + "\" is " + value + ".");
        } else {
            System.out.println("Key \"" + keyToSearch + "\" is not present in the TreeMap.");
        }
    }
}
