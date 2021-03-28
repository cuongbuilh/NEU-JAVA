package ex4_StudentList;

public class Running {
        public static void main(String[] args) throws Exception {
            PeopleList<Student> objStudent = new PeopleList<Student>();
            objStudent.add(new Student("Pham Xuan Minh", "123", "Class1", 22));
            objStudent.add(new Student("Duong Mai Huong", "124", "Class2", 20));
            objStudent.add(new Student("Tran Minh Tuan", "125", "Class1", 19));
            System.out.println("Is the list empty? " + objStudent.checkEmpty());
            System.out.println("Size of the list: " + objStudent.getSize());
            System.out.println("Student Details:");
            System.out.println("************");
            objStudent.display();
        }


}
