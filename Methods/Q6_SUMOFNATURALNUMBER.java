// Write a program to find the sum of n natural numbers using a loop Hint =>1. Get integer input from the user. 2. Write a Method to find the sum of n natural numbers using a loop
import java.util.Scanner;

public class Q6_SUMOFNATURALNUMBER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        int sum = findSumOfNaturalNumbers(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }

    public static int findSumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}