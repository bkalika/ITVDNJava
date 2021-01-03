package starter.lesson5_logic_operators;

public class Cyper {
    public static void main(String[] args) {
        short secretKey = 0b0101;
        char character = 'A';

        System.out.println("Исходный символ: " + character + ", его код в кодовой таблице: " + (byte)character);

        character = (char)(character ^ secretKey);
        System.out.println("Зашифрованный символ: " + character + ", его код в кодовой таблице: " + (byte)character);

        character = (char)(character ^ secretKey);
        System.out.println("Расшифрованный символ: " + character + ", его код в кодовой таблице: " + (byte)character);
    }
}
