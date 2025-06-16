// Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary. Hint => 1. Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years 2. Define a double array to save salary and years of service for each of the 10 employees 3. Also define a double array to save the new salary and the bonus amount, as well as variables to save the total bonus, the total old salary, and the new salary 4. Define a loop to take input from the user. If salary or year of service is an invalid number, then ask the user to enter again. Note, in this case, you will have to decrement the index counter 5. Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop 6. Print the total bonus payout as well as the total old and new salary of all the employees
import java.util.Scanner;
public class Q11_SALARYCOMPARE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EMPLOYEE_COUNT = 10;
        double[] salaries = new double[EMPLOYEE_COUNT];
        int[] yearsOfService = new int[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input loop for employee data
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salaries[i] = scanner.nextDouble();
                if (salaries[i] <= 0) {
                    System.out.println("Invalid salary. Please enter a positive number.");
                    continue;
                }

                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = scanner.nextInt();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative number.");
                    continue;
                }
                break; // Valid input, exit the loop
            }
        }

        // Calculate bonuses and new salaries
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print the results
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        scanner.close();
    }
}
