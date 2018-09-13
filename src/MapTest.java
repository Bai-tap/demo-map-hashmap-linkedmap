import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Son", 19);
        hashMap.put("Tuan Anh", 20);
        hashMap.put("Tien", 21);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        System.out.println(hashMap.get("Son"));

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Long", 25);
        System.out.println(treeMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Hacker");
        linkedHashMap.put(2, "Tre trau");
        linkedHashMap.put(3, "Chicken");
        System.out.println(linkedHashMap.get(1) + linkedHashMap.get(2));
    }
}
