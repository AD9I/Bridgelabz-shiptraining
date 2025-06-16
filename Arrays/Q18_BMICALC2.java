//  An organization took up an exercise to find the Body Mass Index (BMI) of all the team members. For this, create a program to find the BMI and display the height, weight, BMI, and status of each individual. Use a multi-dimensional array to store height, weight, and BMI in the 2D array for all the persons Hint => 1. Take input for the number of persons and create a multi-dimensional array to store weight, height, and BMI. Also create a to store the weight status of the persons double[][] personData = new double[number][3]; String[] weightStatus = new String[number]; 2. Take input for weight and height of the person, and for negative values, ask the user to enter positive values 3. Calculate BMI of all the persons and store them in the personData array, and also find the weight status and put them in the weightStatus array 4. Display the height, weight, BMI, and status of each person 5. Use the table to determine the weight status of the person
import java.util.Scanner;
public class Q18_BMICALC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Step 2: Create a multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numberOfPersons][3]; // [][0] for weight, [][1] for height, [][2] for BMI
        String[] weightStatus = new String[numberOfPersons];

        // Step 3: Take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            do {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                personData[i][0] = scanner.nextDouble();
            } while (personData[i][0] <= 0); // Ensure positive weight

            do {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                personData[i][1] = scanner.nextDouble();
            } while (personData[i][1] <= 0); // Ensure positive height
        }

        // Step 4: Calculate BMI and determine weight status
        for (int i = 0; i < numberOfPersons; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]); // BMI calculation

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
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
                              (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }               

        scanner.close();
    }
        }