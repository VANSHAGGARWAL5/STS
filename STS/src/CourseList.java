import java.util.HashSet;

public class CourseList {
    public static void main(String[] args) { // Corrected main method signature
        HashSet<String> courses = new HashSet<>();
        courses.add("Math");
        courses.add("Science");
        courses.add("Math"); // Duplicate, should not be added
        System.out.println("Courses: " + courses);
    }
}