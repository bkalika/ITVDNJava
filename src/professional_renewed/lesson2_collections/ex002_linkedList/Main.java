package professional_renewed.lesson2_collections.ex002_linkedList;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // head
        System.out.println(getTimeMsOfInsert(0, new ArrayList()));
        System.out.println(getTimeMsOfInsert(0, new LinkedList()));

        // tail
        System.out.println(getTimeMsOfInsert(-1, new ArrayList()));
        System.out.println(getTimeMsOfInsert(-1, new LinkedList()));
    }

    public static long getTimeMsOfInsert(int position, List list){
        Date currentTime = new Date();
        if(position == 0) {
            insert10000(0, list);
        } else {
            insert10000(-1, list);
        }
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time distance is: " + msDelay + " in ms");
        return msDelay;
    }

    public static void insert10000(int position, List list){

        for (int i = 0; i < 10000; i++) {
            if(position == 0){
                list.add(0, new Object());
            } else {
                list.add(new Object());
            }
        }
    }
}
