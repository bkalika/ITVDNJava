package professional_renewed.lesson3_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SimpleLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("Watermelon", "w");
        lhm.put("Melon", "m");
        lhm.put("Banana", "b");

        Set<Map.Entry<String, String>> set = lhm.entrySet();

        for (Map.Entry<String, String> stringStringEntry : set){
            System.out.println(stringStringEntry.getKey() + " " + stringStringEntry.getValue());
        }
    }
}
