import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HighGradeStudents {
    public static void main(String[] args) { // Corrected main method signature
        List<Student> students = new ArrayList<>();
        Student alice = new Student("Alice", "Johnson", 1001);
        alice.getCourses().put("Math", 85);
        students.add(alice);

        Student bob = new Student("Bob", "Smith", 1002);
        bob.getCourses().put("Science", 90);
        students.add(bob);

        Student charlie = new Student("Charlie", "Brown", 1003);
        charlie.getCourses().put("English", 75);
        students.add(charlie);

        List<Student> highScorers = students.stream()
                .filter(student -> student.getAverageGrade() > 80)
                .collect(Collectors.toList());

        System.out.println("Students with grades above 80:");
        for (Student student : highScorers) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " - " + (int) student.getAverageGrade());
        }

        // Convert student names to uppercase using Streams
        List<String> upperCaseNames = students.stream()
                .map(student -> student.getFirstName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println("\nUppercase Student Names:");
        System.out.println(upperCaseNames);

        // Compute the average student grade using Streams
        double avgGrade = students.stream()
                .flatMap(student -> student.getCourses().values().stream())
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("\nAverage Grade: " + avgGrade);
    }
}