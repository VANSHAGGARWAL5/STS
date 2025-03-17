import java.util.function.Consumer;

public class PrintStudentName {
    public static void main(String[] args) { // Corrected main method signature
        Consumer<String> printName = name -> System.out.println("Student: " + name);
        printName.accept("Alice");
    }
}