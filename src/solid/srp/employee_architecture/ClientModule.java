package solid.srp.employee_architecture;

public class ClientModule {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Vova", "Development", true);
        ClientModule.hireEmployee(e1);
        ClientModule.printEmployeeReport(e1, FormatType.XML);
    }

    public static void hireEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.save(employee);

    }

    public static void deleteEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.delete(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
