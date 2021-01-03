package starter.lesson5_logic_operators;

public class ShortLogicComputing {
    // КОРОТКОЗАМКНУТОЕ ВЫЧИСЛЕНИЕ - техника работающая по следующому принципу:
    // Если значение первого операнда в операции AND (&&) ложно, то второй операнд не вычисляется,
    // потому что полное віражение в любом случае будет ложным.

    public static void main(String[] args) {
        final int MIN_VALUE = 1;
        int denominator = 0;
        int item = 2;

        // Условие, которое работает с использование техники КОРОТКОЗАМКНУТОГО ВЫЧИСЛЕНИЯ.
        // Если бы это выражение вычислялось полностью, то операция деления во втором операнде,
        // генерировала бы ошибку деления на 0.

        if((denominator != 0) && (item / denominator) > MIN_VALUE){
            System.out.println("In a block IF");
        } else {
            System.out.println("In a block ELSE");
        }

    }
}
