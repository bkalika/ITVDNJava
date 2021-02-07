package professional_renewed.lesson10_cloning.ex001_shallow.cloning;

public class ShallowCloning {
    public static void main(String[] args) {
        Group group = new Group(1);
        Student student = new Student("Bohdan", 24, group);

        try{
        Student cloneStudent = (Student)student.clone();
            System.out.println(student);
            System.out.println(cloneStudent);

            cloneStudent.name = "Robert";
            cloneStudent.group.id = 10;
            System.out.println("After cloning");
            System.out.println(student);
            System.out.println(cloneStudent);
    } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
