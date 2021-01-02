package essential.lesson10_generics.bird;

public class Main {
    public static void main(String[] args) {
        Strauss[] s = {new Strauss(55), new Strauss(60)};
        Penguin[] p = {new Penguin(13), new Penguin(18), new Penguin(20)};
        Logic<Strauss> l = new Logic<>(s);

        l.display();

        Logic<Penguin> l2 = new Logic<>(p);
        l2.display();

        Logic.weightCompare(l, l2);
    }
}

class Bird{
    int weight;

    Bird(int weight){
        this.weight = weight;
    }

    void move(){

    }
}

class Strauss extends Bird{
    Strauss(int weight){
        super(weight);
    }

    @Override
    void move(){
        System.out.println("Run");
    }
}

class Penguin extends Bird{
    Penguin(int weight){
        super(weight);
    }

    @Override
    void move(){
        System.out.println("Swim");
    }
}

class Logic<T extends Bird> {
    T[] array;
    Logic(T[] array){
        this.array = array;
    }

    void display(){
        for (T temp: array){
            temp.move();
            System.out.println(temp.weight);
        }
    }

    int weightController(){
        int sum = 0;
        for (T temp : array){
            sum += temp.weight;
        }
        return sum;
    }

    static void weightCompare(Logic<?> l, Logic<?> l2){
        System.out.println(l.weightController() - l2.weightController());
    }
}
