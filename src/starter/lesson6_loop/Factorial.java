package starter.lesson6_loop;

public class Factorial {
    public static void main(String[] args) {
        int counter = 5;
        int factorial = 1;

        System.out.println("Factorial a number's: " + counter + "! = ");

        do{
            factorial *= counter--;

        } while(counter > 0);

        System.out.print(factorial);

    }

}
