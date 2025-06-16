// CP - Write a program to take user input for 5 numbers and check whether a number is positive, negative, or zero. Further, for positive numbers check if the number is even or odd. Finally, compare the first and last elements of the array and display if they equal, greater or less Hint => 1. Define an integer array of 5 elements and get user input to store in the array. 2. Loop through the array using the length. If the number is positive, check for even or odd numbers and print accordingly 3. If the number is negative, print negative. Else if the number is zero, print zero.4. Finally, compare the first and last element of the array and display if they equal, greater or less
import java.util.Scanner;
public class Q3_EVENORODDCHECK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Check each number and print results
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        // Compare first and last elements
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        scanner.close();
    }
}