package ex8_EmployeeManagement;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<Employee>(1);
        System.out.println("Employee Class Details: ");
        System.out.println("***********************");
        emp.add(0, new Employee("Raphael John", "A001", "Team Lead"));
        emp.add(1, new Employee("Jenny Samuel", "A002", "Project Manager"));

        EmployeeDetail empObj = new EmployeeDetail();
        empObj.printCollection(emp);

        /**
         * Creates an user defined ArrayList of type HREmployee.
         */
        ArrayList<HREmployee> empHR = new ArrayList<HREmployee>(1);
        System.out.println("\nHREmployee Class Details: ");
        System.out.println("*************************");
        empHR.add(0, new HREmployee("Angelina John", "A001", "Project Manager",
                "Operations", "01"));
        empHR.add(1, new HREmployee("Susan Pitt", "A002", "Team Leader",
                "Writing", "02"));
        empObj.printDerivedCollection(empHR);
    }
}
