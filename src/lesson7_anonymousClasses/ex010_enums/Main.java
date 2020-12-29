package lesson7_anonymousClasses.ex010_enums;

public class Main {
    public static void main(String[] args){
        Company myComp = Company.ITVDN;
        System.out.println(myComp);

        int salary = myComp.getValue();
        String currency = myComp.getCurrency();
        System.out.println("I payed " + salary + " " + currency + " in month.");
    }
}
