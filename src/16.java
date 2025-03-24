import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");
        students.add("Frank");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
