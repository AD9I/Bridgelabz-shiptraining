//  Write a program to input the Principal, Rate, and Time values and calculate Simple Interest. Hint => 1. Simple Interest = Principal * Rate * Time / 100 2. Take user input for principal, rate, time 3. Write a method to calculate the simple interest, given principle, rate, and time as parameters 4. Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
import java.util.Scanner;

public class Q11_SIMPLEINTREST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}