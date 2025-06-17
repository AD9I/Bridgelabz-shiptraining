// Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates Hint => 1. Get an integer value from the user for the numberOfchocolates and numberOfChildren. 2. Write the method to find the number of chocolates each child gets and the number of remaining chocolates public static int[] findRemainderAndQuotient(int number, int divisor)
import java.util.Scanner;

public class Q9_CHOCOLATEDISTRIBUTE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        System.out.println("Chocolates each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;  // Quotient
        result[1] = number % divisor;  // Remainder
        return result;
    }
}