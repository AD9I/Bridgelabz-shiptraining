// Extend or create a NumberChecker utility class and perform the following task. Call from main() method the different methods and display results. Make sure all are static methods Hint => 1. Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors 2. Method to find the number is an abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself 3. Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself 4. Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
import java.util.Scanner;
public class Q24_NUMBERCHECKER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is " + number + " a perfect number? " + isPerfectNumber(number));
        System.out.println("Is " + number + " an abundant number? " + isAbundantNumber(number));
        System.out.println("Is " + number + " a deficient number? " + isDeficientNumber(number));
        System.out.println("Is " + number + " a strong number? " + isStrongNumber(number));
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static boolean isAbundantNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum > n;
    }

    public static boolean isDeficientNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum < n;
    }

    public static boolean isStrongNumber(int n) {
        int originalNumber = n;
        int sumOfFactorials = 0;

        while (n > 0) {
            int digit = n % 10;
            sumOfFactorials += factorial(digit);
            n /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    private static int factorial(int num) {
        if (num == 0 || num == 1) return 1;
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}