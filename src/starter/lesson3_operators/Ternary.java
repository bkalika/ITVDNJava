package starter.lesson3_operators;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        int a = 1, b = 2, max = 0;

        max = (a > b) ? a : b;
        System.out.println(max);

        int c = 1, d = 2, e = -5, max2 = 0;

        max2 = c > 2 ? (c = a) : (c = b);
        System.out.println(max2);

        // ex 3
        String string = "Hello ";

        System.out.println("Input your login:");

        Scanner in = new Scanner(System.in);

        String login = in.next();

        string += login.equals("Admin") ? "Administrator" : "User";
        System.out.println(string);

        // ex 4
        int a2 = 1;
        double b2 = 0.0;
        int max3;

        max3 = (int) ((a > b) ? a : b);

        max3 = (a > b ) ? a : (int)b;

        System.out.println(max3);

        // ex 6
        int x = 0, y = -5;
        String q0, q1, q2;

        q0 = (x > 0) ? ((y > 0) ? "I quadrant" : "IV qadrant") : ((y > 0) ? "II quadrant" : "III quadrant");
        q1 = x > 0 ? (y > 0 ? "I quadrant" : "IV qadrant") : (y > 0 ? "II qadrant" : "III qadrant");
        q2 = x > 0 ? y > 0 ? "I qadrant" : "IV qadrant" : y > 0 ? "II qadrant" : "III qadrant";

        System.out.println(q0);
        System.out.println(q1);
        System.out.println(q2);
    }
}
