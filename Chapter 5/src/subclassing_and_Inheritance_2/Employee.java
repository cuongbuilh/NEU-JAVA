package subclassing_and_Inheritance_2;

public class Employee {
    String empName;

    public Employee() {

    }

    public Employee(String name) {
        empName = name;
    }

    void displayDetails() {
        System.out.printf("Employee Name: %s", empName);
    }
}
