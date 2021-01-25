package professional_renewed.lesson1_collections.simpleCollection;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(list.add(8));
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("list 2-::-:");
        Collection<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2.size());
        list.add(9);
        System.out.println(list);
        System.out.println(list2);
        list2.clear();
        System.out.println(list2.isEmpty());

        Object[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            System.out.println(arr.length);
        }
    }
}
