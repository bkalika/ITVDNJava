package essential.lesson3_inheritance.ex010_super_method;

public class DerivedClass extends BaseClass {

    @Override
    public void method(){
        super.method();

        System.out.println("method from DerivedClass");
    }
}
