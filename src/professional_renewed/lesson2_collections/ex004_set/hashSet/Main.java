package professional_renewed.lesson2_collections.ex004_set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Watermelon");
        set.add("Banana");
        set.add("Melon");
        set.add("Blueberry");
        set.add("Iris");
        set.add("Potato");
        for(String text : set){
            System.out.println(text + " " + text.hashCode());
        }
    }
}
