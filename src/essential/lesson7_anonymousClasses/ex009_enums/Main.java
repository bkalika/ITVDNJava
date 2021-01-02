package essential.lesson7_anonymousClasses.ex009_enums;

enum Company{
    ITVDN(1000), GOOGLE(100), SKYNET(10);
    int value;

    Company (int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

public class Main {
    public static void main(String[] args){
        Company myComp = Company.ITVDN;
        System.out.println("I have studied in " + myComp + "and pay for it " + myComp.getValue());
    }
}
