// An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete Hint => 1. Take user input for 3 sides of a triangle 2. The perimeter of a triangle is the addition of all sides, and rounds is distance/perimeter 3. Write a Method to compute the number of rounds the user needs to do to complete a 5km run
import java.util.Scanner;

public class Q8_TRIANGULARPARK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = sc.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + rounds + " rounds to finish a 5 km run.");
    }

    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000;  // 5 km in meters
        return (int) Math.ceil(distance / perimeter);
    }
}