package patterns.observer;

public class Start {

    public static void main(String[] args) {
        Subscriber1 s1 = new Subscriber1();
        Subscriber2 s2 = new Subscriber2();

        Publisher publisher = new Publisher();

        publisher.addListener(s1);
        publisher.addListener(s2);

        publisher.createMessage("Message!");
    }
}
