package starter.lesson6_loops;

import java.util.Scanner;

public class SpiderLoop {
    public static void main(String[] args) {
        char character = '\0';
        Scanner in = new Scanner(System.in);

        for(; ; ){
            character = in.next().charAt(0);

            switch (character){
                case 'l':
                {
                    System.out.println("Go left");
                    continue;
                }
                case 'r':
                {
                    System.out.println("Go right");
                    continue;
                }
            }

            switch (character){
                case 'x':
                {
                    System.out.println("Exit");
                    break;
                }
                case 'q':
                {
                    System.out.println("Quit");
                    break;
                }
                default:
                {
                    System.out.println("Alternative exit.");
                    break;
                }
            }
            break;
        }
    }
}
