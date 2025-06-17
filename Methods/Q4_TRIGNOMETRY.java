// Write a program to calculate various trigonometric functions using Math class given an angle in degrees Hint => 1. Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent. public double[] calculateTrigonometricFunctions(double angle)
import java.util.Scanner;

public class Q4_TRIGNOMETRY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        double[] trigValues = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double[] result = new double[3];
        double radians = Math.toRadians(angle);
        result[0] = Math.sin(radians);  // Sine
        result[1] = Math.cos(radians);  // Cosine
        result[2] = Math.tan(radians);  // Tangent
        return result;
    }
}