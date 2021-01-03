package starter.lesson5_logic_operators;

public class DeMorganTheoremes {

    //  Перетворення логічних змінних в відповідність з теоремою Де Моргана.

    // Для применения теорем Де Моргана до логічного оператора AND или OR і паре операндов,
    // требуеться инвертировать оба операнда, заменить (AND на OR) або (OR на AND) і
    // інвертувати всі рівняння повністю.

    // Исходное выражение                               Эквивалентное выражение
    // !A & !B                          =               !(A | B)
    // !A & B                           =               !(A | !B)
    // A & !B                           =               !(!A | B)
    // A & B                            =               !(!A | !B)
    // !A | !B                          =               !(A & B)
    // !A | B                           =               !(A & !B)
    // A | !B                           =               !(!A & B)
    // A | B                            =               !(!A & !B)

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Condition before implementing DeMorgan theomer
        if (!a || !b)
            System.out.println("!A || !B = " + (!a || !b));
        else
            System.out.println("!A || !B = " + (!a || !b));

        // Condition after implementing DeMorgan theomer
        if(!(a && b))
            System.out.println("!(A && B) = " + !(a && b));
        else
            System.out.println("!(A && B) = " + !(a && b));
    }

}
