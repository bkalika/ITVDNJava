package starter.lesson5_logic_operators;

public class LogicShift {
    public static void main(String[] args) {
        byte operand = 0b00000001;
        System.out.println("A number to shift: " + operand);

        operand = (byte)(operand << 2);
        System.out.println("A number after left shift: " + operand);

        operand = (byte)(operand >> 1);
        System.out.println("A number after right shift: " + operand);
    }
}
