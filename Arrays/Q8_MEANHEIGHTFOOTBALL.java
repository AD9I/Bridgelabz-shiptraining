//  Create a program to find the mean height of players in a football team. Hint => 1. The formula to calculate the mean is: mean = sum of all elements/number of elements 2. Create a double array named heights of size 11 and get input values from the user. 3. Find the sum of all the elements present in the array. 4. Divide the sum by 11 to find the mean height and print the mean height of the football
// team.
import java.util.Scanner;
public class Q8_MEANHEIGHTFOOTBALL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a double array named heights of size 11
        double[] heights = new double[11];

        // Get input values from the user
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // Find the sum of all the elements present in the array
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }

        // Divide the sum by 11 to find the mean height
        double mean = sum / heights.length;

        // Print the mean height of the football team
        System.out.println("Mean height of the football team: " + mean);

        sc.close();
    }
}