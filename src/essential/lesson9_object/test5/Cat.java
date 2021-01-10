package essential.lesson9_object.test5;

public class Cat {
    String name;
    Cat(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("Barsik");
        Cat c2 = c1;
        if(c1.equals(c2)){
            System.out.println("cat's equals");
        }
        if(c1 == c2){
            System.out.println("Cat's equals");
        } else{
            System.out.println("They're not equals");
        }
    }
}
