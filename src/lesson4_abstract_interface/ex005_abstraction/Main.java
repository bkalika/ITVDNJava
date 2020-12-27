package lesson4_abstract_interface.ex005_abstraction;

public class Main {
    public static void main(String[] args){
        ConcreteDerivedClass instance = new ConcreteDerivedClass();

        instance.simpleMethod();
        instance.abstractMethod();
    }
}
