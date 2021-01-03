package starter.lesson5_logic_operators;

public class Logic {
    public static void main(String[] args) {
        boolean operand1 = false, operand2 = false, result = false;

        // Конъюнкция

//        таблица истинности для конюнкции (И) - && - [AND]
//        если хоть одно из выражений операции коньюнкции имеет значение false -
        // все выражение имеет значение false, иначе - true

        // false && false = false                   true && false = false
        // false && true = false                    true && true = true
        operand1 = true;
        operand2 = false;
        result = operand1 && operand2;

        System.out.println(operand1 + " AND " + operand2 + " = " + result);

        // дизъюнкция
        // таблица истинности для дизьюнкции (ИЛИ) - || - [OR]

        // Если хоть одно из выражений операции дизъюнкции имеет значение true -
        // все выражение имеет значение true, иначе false

        // false || false = false               true || false = true
        // false || true = true                 true || true = true

        operand1 = true;
        operand2 = false;
        result = operand1 || operand2;
        System.out.println(operand1 + " OR " + operand2 + " = " + result);
        
        // Исключащиее ИЛИ
        // таблица истинности для Исключающего ИЛИ - ^ - [XOR]

        // если оба выражения операции Исключающего ИЛИ имеют одинаковое значение -
        // все выражение имеет значение false, если разные - true

        // false ^ false = false                true ^ false = true
        // false ^ true = true                  true^ true = false

        operand1 = true;
        operand2 = false;
        result = operand1 ^ operand2;
        System.out.println(operand1 + "XOR " + operand2 + " = " + result);

        // Отрицание

        // таблица истинности для Отрицания (НЕТ) - ! - [NOT]

        // !false = true
        // !true = false

        operand1 = true;
        result = !operand1;

        System.out.println("NOT " + operand1 + " = " + result);



    }
}
