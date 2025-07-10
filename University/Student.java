import java.util.*;

public abstract class Student {
    String name;
    int id;
    private double gpa;
    private int credits;
    ArrayList<Enrollment> courses = new ArrayList<>();

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void addEnrollment(Enrollment e) {
        courses.add(e);
    }

    void updateGPA(double points, int c) {
        gpa = (gpa * credits + points * c) / (credits + c);
        credits += c;
    }

    public String getTranscript() {
        StringBuilder sb = new StringBuilder("Transcript for " + name + ":\n");
        for (Enrollment e : courses) sb.append(e.course.name + ": " + e.grade + "\n");
        sb.append("GPA: " + gpa);
        return sb.toString();
    }
}
