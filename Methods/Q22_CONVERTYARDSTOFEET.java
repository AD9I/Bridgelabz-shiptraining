// Extend or create a UnitConvertor utility class similar to the one shown in the notes to do the following. Please define static methods for all the UnitConvertor class methods. E.g. public static double convertYardsToFeet(double yards) Hint => 1. Method to convert yards to feet and return the value. Use the following code to convert double yards2feet = 3; 2. Method to convert feet to yards and return the value. Use the following code to convert double feet2yards = 0.333333; 3. Method to convert meters to inches and returns the value. Use the following code to convert double meters2inches = 39.3701; 4. Method to convert inches to meters and return the value. Use the following code to convert double inches2meters = 0.0254; 5. Method to convert inches to centimeters and return the value. Use the following code double inches2cm = 2.54;  
import java.util.Scanner;

public class Q22_CONVERTYARDSTOFEET {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();
        System.out.println("Yards to Feet: " + convertYardsToFeet(yards));

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.println("Feet to Yards: " + convertFeetToYards(feet));

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Meters to Inches: " + convertMetersToInches(meters));

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        System.out.println("Inches to Meters: " + convertInchesToMeters(inches));
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(inches));
    }
}
// This program defines a utility class for converting between yards, feet, meters, inches, and centimeters.
// It includes methods for each conversion and a main method to demonstrate the functionality by taking user input