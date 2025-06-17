// Create a program to find the maximum number of handshakes among the students. Hint => 1. Get integer input for the numberOfStudents variable. 2. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes. 3. Write a method to use the combination formulae to calculate the number of handshakes 4. Display the number of possible handshakes.
import java.util.Scanner;
public class Q5_HANDSHAKES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("The maximum number of handshakes possible is: " + handshakes);
    }

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;  // Combination formula for handshakes
    }
}