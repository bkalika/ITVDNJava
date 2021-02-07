package solid.srp.employee_architecture;

public class EmployeeDAO {

    public void save(Employee employee){
        System.out.println("saved " + employee);
    }

    public void delete(Employee employee){
        System.out.println("Deleted " + employee);
    }

}
