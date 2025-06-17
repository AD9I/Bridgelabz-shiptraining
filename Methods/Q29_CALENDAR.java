// CP - Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g., for 07 2005 user input, the program should display the calendar as shown below Hint => 1. Write a Method to get the name of the month. For this, define a month Array to store the names of the months 2. Write a Method to get the number of days in the month. For this, define a days Array to store the number of days in each month. For February, check for Leap Year to get the number of days. Also, define a Leap Year Method. 3. Write a method to get the first day of the month using the Gregorian calendar algorithm 4. Displaying the Calendar requires 2 for loops. a. The first for loop up to the first day to get the proper indentation. As in the example above, 3 spaces from Sun to Thu as to be set as July 1st starts on Friday b. The Second for loop Displays the days of the month starting from 1 to the number of days. Add proper indentation for single-digit days using %3d to display the integer right-justified in a field of width 3. Please note to move to the next line after Sa
// import java.util.Scanner;
import java.util.*;

public class Q29_CALENDAR {
    static String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int getFirstDay(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100, j = year / 100;
        return (1 + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
    }

    static void printCalendar(int month, int year) {
        System.out.printf("     %s %d\n", monthNames[month - 1], year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int firstDay = getFirstDay(month, year);
        int daysInMonth = monthDays[month - 1];
        if (month == 2 && isLeapYear(year)) daysInMonth++;
        for (int i = 0; i < firstDay; i++) System.out.print("   ");
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt(), year = scanner.nextInt();
        printCalendar(month, year);
    }
}

