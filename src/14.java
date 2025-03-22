public class ScienceReport {
    public static void main(String[] args) {
        // Example usage of variables
        String studentName = "Alice";
        int age = 15;
        double score = 85.6;

        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);

        // Example of using variables in a loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Example of accessing and modifying a variable
        String[] names = {"Alice", "Bob"};
        int count = 3;
        names[count] = "Charlie";
        System.out.println("Updated Names: " + Arrays.toString(names));
    }
}
