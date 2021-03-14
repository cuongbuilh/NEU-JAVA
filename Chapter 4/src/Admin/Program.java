package Admin;
import people.*;

public class Program {
    public static void main(String[] args) {
        Teacher objTeacher = new Teacher();
        objTeacher.setTeacherInfo();
        objTeacher.setTeacherInfo();
        Student objStudent = new Student();
        objStudent.setStudentDetails();
        objStudent.assignTeacher(objTeacher.getName(), objTeacher.getCode());
        objStudent.getStudentDetails();
    }
}
