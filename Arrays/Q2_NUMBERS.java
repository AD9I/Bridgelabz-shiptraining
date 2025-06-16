//  Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers Hint => 1. Create a variable to store an array of 10 elements of type double and a variable to store the total of type double initializes to 0.0. Also, the index variable is initialized to 0 for the array 2. Use infinite while loop as in while (true) 3. Take the user entry and check if the user entered 0 or a negative number to break the loop 4. Also, break from the loop if the index has a value of 10 as the array size is limited to 10. 5. If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value 6. Take another for loop to get the values of each element and add it to the total 7. Finally display the total value
import java.util.Scanner;
public class Q2_NUMBERS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            if (input <= 0 || index >= 10) {
                break; // Exit loop if input is 0 or negative, or if array is full
            }

            numbers[index] = input; // Store the number in the array
            index++; // Increment the index
        }

        // Calculate the total of the numbers entered
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers and the total
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        
        System.out.println("Total: " + total);
        
        sc.close();
    }
}