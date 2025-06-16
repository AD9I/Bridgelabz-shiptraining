//  Create a program to take a number as input, find the frequency of each digit in the number using an array, and display the frequency of each digit Hint => 1. Take the input for a number 2. Find the count of digits in the number 3. Find the digits in the number and save them in an array 4. Find the frequency of each digit in the number. For this, define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit 5. Display the frequency of each digit in the number
import java.util.Scanner;
public class Q14_FREQUENCYOFDIGIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Count the digits in the number
        int digitCount = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCount++;
        }

        // Step 3: Create an array to store the digits
        int[] digits = new int[digitCount];
        tempNumber = number;
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = tempNumber % 10; // Get the last digit
            tempNumber /= 10; // Remove the last digit
        }

        // Step 4: Create a frequency array of size 10
        int[] frequency = new int[10];

        // Step 5: Calculate the frequency of each digit
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Step 6: Display the frequency of each digit
        System.out.println("Frequency of each digit in " + number + ":");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        scanner.close();
    }
}