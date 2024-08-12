/*write a java program to sort keys in a tree map using comparator*/
import java.util.Comparator;
import java.util.TreeMap;

public class Ex8_3 {
    public static void main(String[] args) {
        Comparator<String> ascendingComparator = new Comparator<String>() {
            @Override
            public int compare(String key1, String key2) {
                return key1.compareTo(key2);
            }
        };

        TreeMap<String, Integer> map = new TreeMap<>(ascendingComparator);

        map.put("Apple", 10);
        map.put("Pate", 40);
        map.put("Banana", 20);
        map.put("Elderberry", 50);
        map.put("Cherry", 30);

        System.out.println("TreeMap sorted by keys in descending order:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
