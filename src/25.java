import java.util.*;

public class ScienceReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter students' names: ");
        String[] studentNames = scanner.nextLine().split(",");
        
        for (String name : studentNames) {
            System.out.println(name + " is a good candidate.");
        }
    }
}
