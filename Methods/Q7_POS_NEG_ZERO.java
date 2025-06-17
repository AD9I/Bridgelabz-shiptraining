//  Write a program to check whether a number is positive, negative, or zero. Hint => 1. Get integer input from the user. 2. Write a Method to return -1 for a negative number, 1 for a positive number, and 0 ifthe  number is zero
import java.util.Scanner;

public class Q7_POS_NEG_ZERO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int result = checkNumberSign(number);
        System.out.println("Result: " + result);
    }

    public static int checkNumberSign(int num) {
        if (num > 0) {
            return 1;  // Positive
        } else if (num < 0) {
            return -1; // Negative
        } else {
            return 0;  // Zero
        }
    }
}