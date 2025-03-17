import java.util.function.Predicate;

public class PassingGradeCheck {
    public static void main(String[] args) {
        Predicate<Integer> isPassing = grade -> grade >= 50;
        System.out.println(isPassing.test(75));
        System.out.println(isPassing.test(40));
    }
}