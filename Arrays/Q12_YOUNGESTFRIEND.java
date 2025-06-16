//  Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages, and the tallest among the friends based on their heights Hint =>1. Take user input for age and height for the 3 friends and store it in two arrays, each to store the values for age and height of the 3 friends 2. Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends 3. Finally display the youngest and tallest of the 3 friends
import java.util.Scanner;
public class Q12_YOUNGESTFRIEND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create arrays to store ages and heights of the friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights for each friend
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Find the youngest friend
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }

        // Find the tallest friend
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        // Display the results
        System.out.println("Youngest friend: " + friends[minAgeIndex] + " with age " + ages[minAgeIndex]);
        System.out.println("Tallest friend: " + friends[maxHeightIndex] + " with height " + heights[maxHeightIndex]);

        sc.close();
    }
}