// Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors Hint => 1. Take the input for a number 2. Find the factors of the number and save them in an array. For this, create an integer variable maxFactor and initialize it to 10, the factors array of size maxFactor and the index variable to reflect the index of the array. 3. To find factors, loop through the numbers from 1 to the number, find the factors, and add them to the array element by incrementing the index. If the index is equal to maxIndex, then the need factors array to store more elements 4. To store more elements, reset the maxIndex to twice its size, use the temp array to store the elements from the factors array, and eventually assign the factors array to the temp array 5. Finally, display the factors of the number
import java.util.Scanner;
public class Q10_FACTORS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Initialize variables for factors
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if i is a factor
                if (index == maxFactor) { // If the array is full, resize it
                    maxFactor *= 2; // Double the size
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; // Assign the resized array back to factors
                }
                factors[index++] = i; // Store the factor and increment index
            }
        }

        // Display the factors of the number
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        
        scanner.close();
    }
}