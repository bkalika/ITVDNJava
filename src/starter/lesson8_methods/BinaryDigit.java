package starter.lesson8_methods;

public class BinaryDigit {

    static void converter(int n){
        int temp;

        temp = n % 2;

        if(n >= 2)
            converter(n / 2);

        System.out.println(temp);
    }

    public static void main(String[] args) {
        int n = 6487;

        converter(n);
    }
}
