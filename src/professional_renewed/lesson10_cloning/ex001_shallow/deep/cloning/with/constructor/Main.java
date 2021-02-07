package professional_renewed.lesson10_cloning.ex001_shallow.deep.cloning.with.constructor;

public class Main {
    public static void main(String[] args) {
        Student originalStudent = new Student(24, "Bohdan");
        Student cloneStudent = new Student(originalStudent);

        System.out.println(originalStudent);
        System.out.println(cloneStudent);
    }
}
