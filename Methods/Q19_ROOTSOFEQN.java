//  Write a program Quadratic to find the roots of the equation. Use Math functions Math.pow() and Math.sqrt() Hint => 1. Take a, b, and c as input values to find the roots of x. 2. The roots are computed using the following formulae If delta is positive, find the two roots using formulae If delta is zero, then there is only one root of x If delta is negative, return empty array or nothing 3. Write a Method to find the roots of a quadratic equation and return the roots
import java.util.Scanner;

public class Q19_ROOTSOFEQN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots != null) {
            System.out.println("Roots of the equation are: ");
            for (double root : roots) {
                System.out.println(root);
            }
        } else {
            System.out.println("No real roots found.");
        }
    }

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return null;
        }
    }
}
