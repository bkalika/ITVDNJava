package lesson4_abstract_interface.abs;

public class Main {
    public static void main(String[] args){
        Bird p = new Penguin();
        Bird s = new Strauss();
        Bird sw = new Swallow();

        p.move();
        s.move();
        sw.move();
    }
}
