package starter.lesson3_operators;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("input a number:");
        Scanner sc = new Scanner(System.in);

        Integer num = sc.nextInt();

        switch (num){
            case 1 :{
                System.out.println("One");
                break;
            }
            case 2 : {
                System.out.println("Two");
                break;
            }
            default:{
                System.out.println("Else");
                break;
            }
        }
    }
}
