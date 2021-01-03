package starter.lesson8_methods;

import java.util.Scanner;

public class Methods {

    static int addTwo(int a){
        a = a + 2;
        System.out.println("Value int a = " + a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Input a number:");
        Scanner in = new Scanner(System.in);

        String number = in.next();
        int result = Integer.parseInt(number);

        System.out.println("Value result = " + result);
        result = 10;

        result = addTwo(result);
        System.out.println(addTwo(result));
        System.out.println(result);
    }
}
