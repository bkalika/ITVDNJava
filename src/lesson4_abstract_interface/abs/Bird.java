package lesson4_abstract_interface.abs;

public abstract class Bird implements Creator{
    public void live(){
        System.out.println("I can live.");
    }

    public abstract void move();

    public void eat(){
        System.out.println("I can eat");}
}
