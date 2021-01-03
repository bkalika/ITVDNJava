package starter.lesson8_methods;

public class Recursion {
    static void recursion(int counter){
        counter--;

        System.out.println("First part of the method: " + counter);

        if (counter != 0)
            recursion(counter);

        System.out.println("Second part of the method: " + counter);
    }

    public static void main(String[] args){
        recursion(3);
    }
}
