package starter.lesson2_types;

public class Main {
    public static void main(String[] args) {
        int e = 128;
        int f = 0;
        f = (byte)e;

        int e2 = 639;
        int f2 = 0;
        f2 = (byte)e2;

        int e3 = 2;
        int f3 = 0;
        f3 = (byte)e3;

        final int e4 = 127; // but not > 127
        byte f4 = 0;
        f4 = e4;

        System.out.println("f = " + f);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);


        // IncDec

        byte number1 = 0;
        System.out.println(++number1);
        System.out.println(++number1);
        System.out.println(number1++);
        System.out.println(number1++);
    }

}
