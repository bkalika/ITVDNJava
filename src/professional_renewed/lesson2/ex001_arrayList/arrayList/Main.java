package professional_renewed.lesson2.ex001_arrayList.arrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; i++){
            System.out.println("Input a value [" + i + "]");
            String s = reader.readLine();

            arrayList.add(0, s);
        }

        for(int i = 0; i < 5; i++){
            String s1 = arrayList.remove(arrayList.size() - 1);
            arrayList.add(s1);
        }

        for(String temp : arrayList){
            System.out.println(temp);
        }
    }
}