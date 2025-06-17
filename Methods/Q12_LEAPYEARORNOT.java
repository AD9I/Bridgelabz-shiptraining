// Write a program that takes a year as input and outputs whether the Year is a Leap Year or not Hint => 1. The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 2. Also, the Leap year is divisible by 4 and not divisible by 100 or divisible by 400 3. Write a method to check for a Leap Year using the above two conditions
import java.util.Scanner;   
public class Q12_LEAPYEARORNOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            throw new IllegalArgumentException("Year must be greater than or equal to 1582.");
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}