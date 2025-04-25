public class ScienceReport {
    private String name;
    private int age;

    public ScienceReport(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Add your own methods and functionalities here

    public static void main(String[] args) {
        ScienceReport report1 = new ScienceReport("Alice", 20);
        ScienceReport report2 = new ScienceReport("Bob", 30);
        System.out.println(report1 + " is a student with age " + report1.age);
        System.out.println(report2 + " is also a student with age " + report2.age);
    }
}
