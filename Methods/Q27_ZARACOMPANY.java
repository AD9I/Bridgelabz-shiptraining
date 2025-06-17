// Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary. Hint =>1. Zara decides to give a bonus of 5% to employees with more than 5 years of service or 2% if less than 5 years 2. Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define a 2D Array to save the salary and years of service. 3. Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 4. Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
import java.util.Random;

public class Q27_ZARACOMPANY {
    private static final int EMPLOYEE_COUNT = 10;

    public static void main(String[] args) {
        double[][] employeeData = new double[EMPLOYEE_COUNT][2]; // [][0] = salary, [][1] = years of service
        generateEmployeeData(employeeData);
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        displayEmployeeData(updatedData);
    }

    private static void generateEmployeeData(double[][] data) {
        Random random = new Random();
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            data[i][0] = 10000 + random.nextInt(90000); // Salary between 10000 and 99999
            data[i][1] = 1 + random.nextInt(20); // Years of service between 1 and 20
        }
    }

    private static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] updatedData = new double[EMPLOYEE_COUNT][3]; // [][0] = old salary, [][1] = new salary, [][2] = bonus
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double oldSalary = data[i][0];
            double yearsOfService = data[i][1];
            double bonus = (yearsOfService > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }
        return updatedData;
    }

    private static void displayEmployeeData(double[][] data) {
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Old Salary", "New Salary", "Bonus", "Years of Service");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("%-15.2f %-15.2f %-15.2f %-15.2f%n", data[i][0], data[i][1], data[i][2], data[i][1] - data[i][0]);
        }
    }
}