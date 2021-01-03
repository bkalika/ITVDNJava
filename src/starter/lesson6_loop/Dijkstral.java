package starter.lesson6_loop;

import java.util.Scanner;

public class Dijkstral {
    public static void main(String[] args) {
        char character;
        Scanner in = new Scanner(System.in);

        for(; ; ){
            character = in.next().charAt(0);

            switch (character){
                case 'l':
                    System.out.println("Go left");
                    continue;

                case 'r':
                    System.out.println("Go right");
                    continue;
            }
            break;
        }
    }
}
