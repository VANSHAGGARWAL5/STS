import java.util.TreeSet;

public class SortedStudentList {
    public static void main(String[] args) { // Corrected main method signature
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Alice", "Johnson", 1001));
        students.add(new Student("Bob", "Smith", 1002));
        students.add(new Student("Charlie", "Brown", 1000)); // Add another student

        System.out.println("Sorted Students by ID:");
        for (Student student : students) {
            System.out.println(student.getStudentID() + " - " + student.getFirstName() + " " + student.getLastName());
        }
    }
}