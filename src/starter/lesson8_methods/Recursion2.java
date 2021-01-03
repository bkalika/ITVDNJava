package starter.lesson8_methods;

public class Recursion2 {

    static void recursion(int counter){
        counter--;

        System.out.println("First part of the method recursion: " + counter);

        if(counter != 0){
            method(counter);
        }

        System.out.println("Second part of the method recursion: " + counter);
    }

    static void method(int counter){
        System.out.println("First part of the method: " + counter);

        recursion(counter);

        System.out.println("Second part of the method: " + counter);
    }

    public static void main(String[] args) {
        method(3);
    }
}
