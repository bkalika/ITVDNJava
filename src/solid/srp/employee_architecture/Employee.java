package solid.srp.employee_architecture;

public class Employee {
    private int id;
    private String name;
    private String department;
    private boolean working;

    public Employee(int id, String name, String department, boolean working){
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    public String toString(){
        return "ID: " + this.id +
                " name: " + this.name +
                " department: " + this.department +
                " working: " + this.working;
    }
}
