package professional_renewed.lesson3;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class SimpleWeakHashMap {
    public static void main(String[] args) {
        Map<String, String> weakHashMap = new WeakHashMap<>();
        Map<String, String> hashMap = new HashMap<>();

        String keyWeakHashMap = new String("keyWeakHashMap");
        String keyHashMap = new String("keyHashMap");

        weakHashMap.put(keyWeakHashMap, "weakHash");
        hashMap.put(keyHashMap, "Hash");

        System.out.println("Before gc, weak: " + weakHashMap.get("keyWeakHashMap") + " hash = " + hashMap.get("keyHashMap"));

        keyWeakHashMap = null;
        keyHashMap = null;

        System.gc();

        System.out.println("After gc, weak: " + weakHashMap.get("keyWeakHashMap") + " hash = " + hashMap.get("keyHashMap"));
    }
}
