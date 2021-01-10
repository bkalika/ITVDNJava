package professional_renewed.lesson2.ex001_arrayList.arrayList_reverse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0 ; i < 3; i++){
            System.out.println("Input a value [" + i + "]");
            String s =  reader.readLine();
            arrayList.add(s);
        }

        for (int i = 0; i < arrayList.size(); i++){
            int j = arrayList.size() - i - 1;
            System.out.println(arrayList.get(j));
        }
    }
}
