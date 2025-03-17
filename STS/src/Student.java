import java.util.HashMap;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int studentID;
    private HashMap<String, Integer> courses;

    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.courses = new HashMap<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public HashMap<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(HashMap<String, Integer> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentID=" + studentID +
                '}';
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.studentID, otherStudent.studentID);
    }

    public double getAverageGrade() {
        if (courses.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : courses.values()) {
            sum += grade;
        }
        return (double) sum / courses.size();
    }
}