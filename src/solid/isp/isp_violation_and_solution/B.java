package solid.isp.isp_violation_and_solution;

public class B {
    private I i;

    public B(I i ){
        this.i = i;
    }

    public void callGetDate(){
        i.getDate();
    }
}
