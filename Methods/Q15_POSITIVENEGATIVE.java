//  Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further, for positive numbers, check if the number is even or odd. Finally, compare the first and last elements of the array and display if they are equal, greater, or less Hint => 1. Write a Method to check whether the number is positive or negative 2. Write a Method to check whether the number is even or odd 3. Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 4. In the main program, Loop through the array using the length, call the method isPositive(), and if positive, callthe method isEven() and print accordingly 5. If the number is negative, print negative. 6. Finally, compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less
import java.util.Scanner;

public class Q15_POSITIVENEGATIVE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is positive.");
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is even.");
                } else {
                    System.out.println(numbers[i] + " is odd.");
                }
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("First element is greater than last element.");
        } else if (comparisonResult == 0) {
            System.out.println("First element is equal to last element.");
        } else {
            System.out.println("First element is less than last element.");
        }
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
}