// An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this, create a program to find the BMI and display the height, weight, BMI, and status of each individual Hint => 1. Take user input in double for the weight (in kg) of the person and height (in cm) of the person and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column stores the weight, the second column stores the height in cm, and the third column is the BMI 2. Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note that the unit is kg/m^2. For this, convert cm to meter 3. Create a Method to determine the BMI status using the logic shown in the figure below and return the array of all the persons' BMI statuses.
// 4. Display the height, weight, BMI, and status of each individual
import java.util.Scanner;

public class Q21_BMIHEGHTWEIGHT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] bmiData = new double[10][3];
        String[] status = new String[10];

        // Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            bmiData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            bmiData[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(bmiData);

        // Determine BMI status
        status = determineBMIStatus(bmiData);

        // Display results
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-10s\n", bmiData[i][0], bmiData[i][1], bmiData[i][2], status[i]);
        }
    }

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100; // Convert cm to m
            data[i][2] = weight / (height * height); // BMI formula
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 24.9) {
                status[i] = "Normal";
            } else if (bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}
