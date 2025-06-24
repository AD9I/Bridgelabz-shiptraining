// Q2_Circle.java
// Circle class with constructor chaining
public class Q2_Circle {
    double radius;
    // ...existing code...
    public Q2_Circle() {
        this(1.0); // Default radius
    }
    public Q2_Circle(double radius) {
        this.radius = radius;
    }
    public void display() {
        System.out.println("Radius: " + radius);
    }
    public static void main(String[] args) {
        Q2_Circle c1 = new Q2_Circle();
        Q2_Circle c2 = new Q2_Circle(5.5);
        c1.display();
        c2.display();
    }
}
