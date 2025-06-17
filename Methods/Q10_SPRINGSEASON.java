//  Write a program SpringSeason that takes two int values, month and day from the command line and prints “It's a Spring Season” otherwise prints “Not a Spring Season”. Hint => 1. Spring Season is from March 20 to June 20. 2. Write a Method to check for the Spring season and return a boolean true or false
import java.util.Scanner;

public class Q10_SPRINGSEASON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) {
            return true;
        } else if (month == 6 && day <= 20) {
            return true;
        } else if (month > 3 && month < 6) {
            return true;
        }
        return false;
    }
}