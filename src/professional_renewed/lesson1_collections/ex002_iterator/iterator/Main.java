package professional_renewed.lesson1_collections.ex002_iterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(2);
        al.add(5);
        al.add(7);

        System.out.println(al);

        Iterator<Integer> iterator = al.iterator();

        while(iterator.hasNext()){
            Integer tmp = iterator.next();
            System.out.print(tmp + " ");
        }

        System.out.println("\nListIterator:");

        ListIterator<Integer> listIterator = al.listIterator();

        while(listIterator.hasNext()){
            Integer tmp = listIterator.next();
            System.out.print(tmp + " ");
        }
    }
}
