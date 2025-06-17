// Write a program to find the sum of n natural numbers using the recursive method and compare the result with the formulae n(n+1)/2* and show that the result from both computations is correct. Hint => 1. Take the user input number and check whether it's a Natural number 2. Write a Method to find the sum of n natural numbers using recursion 3. Write a Method to find the sum of n natural numbers using the formulae n(n+1)/2 Compare the two results and print the result
import java.util.Scanner;

public class Q23_SUMOFNUSINGRECURSSION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
            return;
        }

        int recursiveSum = sumOfNaturalNumbers(n);
        int formulaSum = (n * (n + 1)) / 2;

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("There is a discrepancy between the two methods.");
        }
    }

    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }
}