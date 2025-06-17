// Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it Hint => 1. Take user input for the age and height of the 3 friends and store it in two arrays each to store the values for the age and height of the 3 friends 2. Write a Method to find the youngest of the 3 friends3. Write a Method to find the tallest of the 3 friends
import java.util.Scanner; 
public class Q16_AMARAKBARANTHANY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for ages
        int[] ages = new int[3];
        System.out.print("Enter age of Amar: ");
        ages[0] = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        ages[1] = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        ages[2] = sc.nextInt();

        // Input for heights
        double[] heights = new double[3];
        System.out.print("Enter height of Amar: ");
        heights[0] = sc.nextDouble();
        System.out.print("Enter height of Akbar: ");
        heights[1] = sc.nextDouble();
        System.out.print("Enter height of Anthony: ");
        heights[2] = sc.nextDouble();

        // Find youngest and tallest
        String youngestFriend = findYoungest(ages);
        String tallestFriend = findTallest(heights);

        // Output results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
    }

    public static String findYoungest(int[] ages) {
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        return switch (minAgeIndex) {
            case 0 -> "Amar";
            case 1 -> "Akbar";
            case 2 -> "Anthony";
            default -> "Unknown";
        };
    }

    public static String findTallest(double[] heights) {
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        return switch (maxHeightIndex) {
            case 0 -> "Amar";
            case 1 -> "Akbar";
            case 2 -> "Anthony";
            default -> "Unknown";
        };
    }
}