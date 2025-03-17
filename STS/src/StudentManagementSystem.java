import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student student = new Student(firstName, lastName, studentID);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void findStudentByID() {
        System.out.print("Enter student ID to find: ");
        int studentID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student with ID " + studentID + " not found.");
    }

    public void removeStudent() {
        System.out.print("Enter student ID to remove: ");
        int studentID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == studentID) {
                students.remove(i);
                System.out.println("Student removed successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + studentID + " not found.");
    }

    public void run() {
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Find Student by ID");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    findStudentByID();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) { // Corrected main method signature
        StudentManagementSystem system = new StudentManagementSystem();
        system.run();
    }
}