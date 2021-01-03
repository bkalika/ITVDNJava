package starter.lesson5_logic_operators;

public class LogicExample {
    public static void main(String[] args) {
        int a = 0, b = 5, x = 3;

        if (a < x && x < b){
            System.out.println("A number " + x + " included in a number diapason from " + a + " to " + b + ".");
        } else{
            System.out.println("A number " + x + " does not included in a number diapason from " + a + " to " + b + ".");
        }
    }
}
