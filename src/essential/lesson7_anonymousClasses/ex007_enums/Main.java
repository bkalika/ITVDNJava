package essential.lesson7_anonymousClasses.ex007_enums;

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args){
        Day today = Day.SATURDAY;
        System.out.println("Today is " + today);

        Day number = Day.TUESDAY;

        today = number;
        System.out.println("Today is " + today);

    }
}
