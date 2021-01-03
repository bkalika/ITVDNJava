package starter.lesson8_methods;

public class Recursion3 {

    static int calculate(int a, int b){
        if (a % b == 0)
            return b;
        else
            return calculate(b, a % b);
    }

    public static void main(String[] args){
        System.out.println("Search the most main divided two integer (whole) numbers");

        int a = 676, b = 3676;

        System.out.println("a = " + a + ", b = " + b + ", НОД = " + calculate(a, b) + ";");
        System.out.println("a = " + a + ", b = " + b + ", НОД = " + calculate2(a, b) + ";");
    }

    static int calculate2(int a, int b){
        while (b != 0)
            b = a % (a = b);
        return a;
    }
}
