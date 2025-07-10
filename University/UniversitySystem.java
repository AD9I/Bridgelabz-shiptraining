public class UniversitySystem {
    public static void main(String[] args) {
        Undergraduate u = new Undergraduate("Adi", 1);
        Postgraduate p = new Postgraduate("Sharma", 2);

        Course c1 = new Course("DSA", 3);
        Course c2 = new Course("OOP", 4);

        Enrollment e1 = new Enrollment(u, c1);
        Enrollment e2 = new Enrollment(p, c2);

        u.addEnrollment(e1);
        p.addEnrollment(e2);

        Faculty f = new Faculty("Dr. Sudershan");
        f.assignGrade(e1, "A");
        f.assignGrade(e2, "B");

        System.out.println(u.getTranscript());
        System.out.println(p.getTranscript());
    }
}
