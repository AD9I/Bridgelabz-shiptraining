//  Write a program to take 2 numbers and print their quotient and reminder Hint => 1. Take user input as integer 2. Use the division operator (/) for the quotient and moduli operator (%) for remainder 3. Write Method to find the remainder and the quotient of a number public static int[] findRemainderAndQuotient(int number, int divisor)
import java.util.Scanner;

public class Q1_QUOTIENTANDREMAINDER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int[] result = findRemainderAndQuotient(num1, num2);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;  // Quotient
        result[1] = number % divisor;  // Remainder
        return result;
    }
}