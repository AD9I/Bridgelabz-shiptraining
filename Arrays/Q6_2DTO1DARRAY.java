//  Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and copy the 2D Array into a single dimension array Hint => 1. Take user input for rows and columns, create a 2D array (Matrix), and take the user input 2. Copy the elements of the matrix to a 1D array. For this, create a 1D array of size rows*columns as in int[] array = new int[rows * columns]; 3. Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index 4. Note: For looping through the 2D array, you will need a Nested for loop, an Outer for loop for rows, and an inner for loop to access each element
import java.util.Scanner;
public class Q6_2DTO1DARRAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array (Matrix)
        int[][] matrix = new int[rows][columns];

        // Take user input to fill the 2D array
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to copy elements from the 2D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display the elements of the 1D array
        System.out.println("Elements in the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        scanner.close();
    }
}