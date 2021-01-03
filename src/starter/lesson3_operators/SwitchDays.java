package starter.lesson3_operators;

import java.util.Scanner;

public class SwitchDays {
    public static void main(String[] args) {
        System.out.println("Input day number:");

        Scanner scanner = new Scanner(System.in);

        String day = scanner.next();

        switch (day) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5": {
                System.out.println("Work day");
                break;
            }
            case "6":
            case "7":
                System.out.println("Week day");
                break;

            default:
                System.out.println("day does not exist");
                break;
        }
    }
}
