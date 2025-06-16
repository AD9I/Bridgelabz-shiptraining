//  Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result Hint => 1. Take integer input and store it in the variable number, as well as define an integer array to store the multiplication result in the variable multiplicationResult 2. Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array 3. Finally, display the result from the array in the format number * i = ___
import java.util.Scanner;
public class Q7_MULTIPLICATIONFROM6TO9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        // Define an integer array to store multiplication results
        int[] multiplicationResult = new int[4]; // For 6, 7, 8, and 9

        // Using a for loop to find the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display the result from the array
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        sc.close();
    }
}