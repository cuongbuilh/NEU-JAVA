package subclassing_and_Inheritance_2;

public class Program {
    public static void main(String[] args) {

        Employee objJohn = new SalaryEmployee("John", 2300.50);
        objJohn.displayDetails();

        Employee objDavid = new WageEmployee("David", 34.50, 10);
        objDavid.displayDetails();
    }

}
