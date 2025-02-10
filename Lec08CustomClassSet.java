import java.util.HashSet;
import java.util.Set;

public class Lec08CustomClassSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Reet Priye", 01));
        studentSet.add(new Student("Preet Priye", 02));
        studentSet.add(new Student("Shivam Kumar", 03));
        studentSet.add(new Student("Manish Kumar", 04));
        studentSet.add(new Student("Manish", 04)); // WIll not add this value due to equals()

        System.out.println(studentSet);
    }
}
