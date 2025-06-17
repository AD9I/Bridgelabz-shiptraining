//  Write a program to find the smallest and the largest of the 3 numbers. Hint => 1. Take user input for 3 numbers 2. Write a single method to find the smallest and the largest of the three numbers public static int[] findSmallestAndLargest(int number1, int number2, int number3)
import java.util.Scanner;

public class Q3_SMALLESTANDLARGEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        int[] result = findSmallestAndLargest(num1, num2, num3);
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2];
        result[0] = Math.min(Math.min(number1, number2), number3);  // Smallest
        result[1] = Math.max(Math.max(number1, number2), number3);  // Largest
        return result;
    }
}