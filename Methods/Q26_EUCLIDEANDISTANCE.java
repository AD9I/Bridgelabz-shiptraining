//  Write a program for Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt() Hint => 1. Take inputs for 2 points x1, y1, and x2, y2 2. Method to find the Euclidean distance between two points and return the distance 3. Write a Method to find the equation of a line given two points and return the equation, which includes the slope and the y-intercept The equation of a line is given by the equation where m is the slope and b is the y-intercept. So, firstly compute the slope using the formulae Post that compute the y-intercept b using the formulae Finally, return an array having slope m and y-intercept b
import java.util.Scanner;
public class Q26_EUCLIDEANDISTANCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the coordinates of the first point (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter the coordinates of the second point (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the points is: " + distance);

        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("The equation of the line is: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1); // m = (y2 - y1) / (x2 - x1)
        double intercept = y1 - slope * x1; // b = y1 - m * x1
        return new double[]{slope, intercept};
    }
}