package subclassing_and_Inheritance_2;

public class SalaryEmployee extends Employee {
    double salary;

    public SalaryEmployee() {

    }
    public SalaryEmployee(String name, double currentSalary) {
        super(name);
        salary = currentSalary;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.printf("\n" + empName + "'s Salary: %.2f\n", salary);
    }


}
