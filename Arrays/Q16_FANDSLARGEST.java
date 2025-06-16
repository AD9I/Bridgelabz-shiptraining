//  Create a program to store the digits of the number in an array and find the largest and second largest element of the array. Hint => 1. Create a number variable and take user input. 2. Define an array to store the digits. Set the size of the array to the maxDigit variable initially set to 10 3. Create an integer variable index with the value 0 to reflect the array index. 4. Use a loop to iterate until the number is not equal to 0. 5. Remove the last digit from the number in each iteration and add it to the array. 6. Increment the index by 1 in each iteration, and if the index count equals maxDigit, then break out of the loop, and the remaining digits are not added to the array 7. Define a variable to store the largest and second largest digit and initialize it to zero 8. Loop through the array and use conditional statements to find the largest and second largest number in the array 9. Finally display the largest and second-largest number
import java.util.Scanner;
public class Q16_FANDSLARGEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Define an array to store the digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 4: Loop to extract digits
        while (number != 0) {
            if (index == maxDigit) {
                break; // Stop if we reach the maximum size of the array
            }
            int digit = number % 10; // Get the last digit
            digits[index] = digit; // Store it in the array
            index++; // Increment index
            number /= 10; // Remove the last digit from the number
        }

        // Step 7: Initialize variables for largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Step 8: Find largest and second largest numbers
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest if it's not equal to largest
            }
        }

        // Step 9: Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close();
    }
}