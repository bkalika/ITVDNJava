package solid.isp.isp_violation_and_solution;

public class A {
    private I i;

    public A(I i){
        this.i = i;
    }

    public void callGetName(){
        System.out.println(i.getName());
    }
}
