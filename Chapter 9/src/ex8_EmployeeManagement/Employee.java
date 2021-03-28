package ex8_EmployeeManagement;

public class Employee {
    private String employeeName;
    private String employeeNo;
    private String employeeDesgn;

    public Employee() {
    }

    public Employee(String eName, String eNo, String eDesgn) {
        employeeName = eName;
        employeeNo = eNo;
        employeeDesgn = eDesgn;
    }

    public String toString() {
        return "Name: " + employeeName + "\tNumber: " + employeeNo
                + "\tDesignation: " + employeeDesgn;
    }
}
