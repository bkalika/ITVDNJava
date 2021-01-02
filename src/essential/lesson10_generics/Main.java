package essential.lesson10_generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List l = new ArrayList();
        List<String> list = new ArrayList<>();

        l = list;
        l.add("Hello");

        String s = list.get(0);
        System.out.println(s);
    }
}
