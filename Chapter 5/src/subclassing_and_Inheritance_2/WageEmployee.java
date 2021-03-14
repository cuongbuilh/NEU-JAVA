package subclassing_and_Inheritance_2;

public class WageEmployee extends Employee{
    double rate;
    int hours;

    public WageEmployee() {

    }

    public WageEmployee(String name, double wageRate, int wageHours) {
        super(name);
        rate = wageRate;
        hours = wageHours;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.printf("\n" + empName + "'s Salary: %.2f\n", rate * hours);
    }

}
