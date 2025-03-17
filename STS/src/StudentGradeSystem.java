import java.util.HashMap;
import java.util.Map;

public class StudentGradeSystem {
    private HashMap<String, Integer> studentGrades = new HashMap<>();

    public void addStudentGrade(String name, int grade) {
        studentGrades.put(name, grade);
    }

    public Integer getStudentGrade(String name) {
        return studentGrades.get(name);
    }

    public void displayAllStudentGrades() {
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        StudentGradeSystem gradeSystem = new StudentGradeSystem();
        gradeSystem.addStudentGrade("Alice", 85);
        gradeSystem.addStudentGrade("Bob", 90);
        gradeSystem.displayAllStudentGrades();
    }
}