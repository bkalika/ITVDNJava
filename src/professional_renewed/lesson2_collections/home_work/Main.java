package professional_renewed.lesson2_collections.home_work;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text:");

        ArrayList<String> list = new ArrayList<>();

        while(true){
            String text = scanner.nextLine();
            if (text.equals("end")) {
                break;
            }
//            System.out.println("You entered: " + text);
            list.add(text);
//            System.out.println(list);
        }

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
//        System.out.println(list);

    }
}
