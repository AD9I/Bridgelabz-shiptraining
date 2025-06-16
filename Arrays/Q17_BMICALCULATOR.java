// An organization took up an exercise to find the Body Mass Index (BMI) of all the team members. For this, create a program to find the BMI and display the height, weight, BMI, and status of each individual Hint => 1. Take input for the number of persons 2. Create arrays to store the weight, height, BMI, and weight status of the persons 3. Take input for the weight and height of the person 4. Calculate the BMI of all the persons and store them in an array, and also find the weight status of the persons5. Display the height, weight, BMI, and weight status of each person 6. Use the table to determine the weight status of the person
import java.util.Scanner;
public class Q17_BMICALCULATOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Step 2: Create arrays to store weight, height, BMI, and weight status
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmiValues = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Step 3: Take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Step 4: Calculate BMI and determine weight status
        for (int i = 0; i < numberOfPersons; i++) {
            bmiValues[i] = weights[i] / (heights[i] * heights[i]);
            if (bmiValues[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmiValues[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Step 5: Display the results
        System.out.println("\nBMI Results:");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s%n", "Person", "Weight(kg)", "Height(m)", "BMI", "Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s%n", 
                              (i + 1), weights[i], heights[i], bmiValues[i], weightStatus[i]);
        }   
        scanner.close();
    }                           
        }


