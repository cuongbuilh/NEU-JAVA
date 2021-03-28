package ex8_EmployeeManagement;

public class HREmployee extends Employee {
    private String deptName;
    private String deptCode;

    public HREmployee() {
    }

    public HREmployee(String name, String num, String desig, String dept,
                      String code) {
        super(name, num, desig);
        deptName = dept;
        deptCode = code;
    }

    public String toString() {
        return super.toString() + "\tDepartment Name: " + deptName
                + "\tDepartment Code:" + deptCode;
    }
}
