//  Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order Hint => 1. Take user input for a number. 2. Find the count of digits in the number. 3. Find the digits in the number and save them in an array 4. Create an array to store the elements of the digits array in reverse order 5. Finally, display the elements of the array in reverse order
import java.util.Scanner;
public class Q15_REVERSETHENUMBER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input for the number
        System.out.print("Enter a number to reverse: ");
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

        // Step 4: Display the elements of the array in reverse order
        System.out.print("Reversed number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        
        System.out.println(); // New line for better output formatting
        scanner.close();
    }
}