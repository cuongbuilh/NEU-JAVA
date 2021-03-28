package ex4_StudentList;

public class Student {

    String StudentName;
    String StudentID;
    String description;
    int Studentage;

    public Student() {
    }

    public Student(String pName, String pID, String descr, int age) {
        StudentName = pName;
        StudentID = pID;
        description = descr;
        Studentage = age;
    }

    public String toString() {
        return "Student Name: " + StudentName + "\tStudent ID: " + StudentID
                + "\tDescription: " + description + "\tage: " + Studentage;
    }
}
