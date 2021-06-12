package patterns.singleton;

public class TestSingleton {
    public static TestSingleton instance;

    public static TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }

    private TestSingleton(){

    }

    public void print() {
        System.out.println(this);
    }
}
