package professional_renewed.lesson2.arrayDeque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();

        states.add("Ukraine");
        states.add("France");

        states.push("Great Britain");

        String sFirst = states.getFirst();
        String sLast = states.getLast();

        while(states.peek() != null){
            System.out.println(states.pop());
        }
        System.out.println("Queue size: " + states.size());

        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Tom"));
        people.addFirst(new Person("Nick"));
        for(Person p : people){
            System.out.println(p.getName());
        }
    }
}
