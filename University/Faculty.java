public class Faculty implements Graded {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    public void assignGrade(Enrollment e, String grade) {
        e.grade = grade;
        double points = switch (grade) {
            case "A" -> 4.0;
            case "B" -> 3.0;
            case "C" -> 2.0;
            case "D" -> 1.0;
            default -> 0.0;
        };
        e.student.updateGPA(points, e.course.credit);
    }
}
