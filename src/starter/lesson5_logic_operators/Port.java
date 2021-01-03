package starter.lesson5_logic_operators;

public class Port {
    public static void main(String[] args) {
        byte port = 0b1110000;
        byte mask = 0b000010;
        System.out.println("port = " + port);

        port = (byte)(port | mask);
        System.out.println("port = " + port);

        mask = 0b1111101;

        port = (byte)(port & mask);
        System.out.println("port = " + port);
    }
}
