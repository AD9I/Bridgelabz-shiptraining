//  Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18. Hint => 1. Create a class public class StudentVoteChecker, and define a method public boolean canStudentVote(int age) which takes in age as a parameter and returns true or false. 2. Inside the method firstly validate the age for a negative number, if a negative return is false cannot vote. For valid age check for age is 18 or above return true; else return false; 3. In the main function, define an array of 10 integer elements, loop through the array by take user input for the student's age, call canStudentVote(), and display the result
import java.util.Scanner;

public class Q13_STUDENTVOTECHECKER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }

    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }
}