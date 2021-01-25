package professional_renewed.lesson8_annotations_javadoc_varargs.simple_anno;

public class A{
    public static void print(){
        System.out.println("A");
    }
}

class B extends A{
    public static void print(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        A a = new B();
        a.print();
        A.print();
    }
}

