package professional_renewed.lesson1_collections.simpleMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("World", 500);
        System.out.println(map.size());
        map.put("World", 1500);
        map.put("World2", 2500);
        map.put("World3", 3500);
        map.put(null, 1);
        System.out.println(map.size());
        System.out.println(map);

        for(Map.Entry<String, Integer> tmp : map.entrySet()){
            System.out.println(tmp.getKey() + " " + tmp.getValue());
        }
    }
}
