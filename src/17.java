public class ScienceReport {
    private String subject;
    private double marks;

    public ScienceReport(String subject, double marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public void calculateGrade() {
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        }
    }

    public String getGrade() {
        return grade;
    }
}
