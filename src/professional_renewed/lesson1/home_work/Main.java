package professional_renewed.lesson1.home_work;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 11; i++){
            list.add(i*10);
        }

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println("Value is: " + iterator.next());
        }
    }
}
