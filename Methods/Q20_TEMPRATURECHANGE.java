// Extend or create a UnitConvertor utility class similar to the one shown in the notes to do the following. Please define static methods for all the UnitConvertor class methods. E.g. public static double convertFarhenheitToCelsius(double farhenheit) Hint =>1. Method to convert Fahrenheit to Celsius and return the value. Use the following code double farhenheit2celsius = (farhenheit - 32) * 5 / 9; 2. Method to convert Celsius to Fahrenheit and return the value. Use the following code double celsius2farhenheit = (celsius * 9 / 5) + 32; 3. Method to convert pounds to kilograms and return the value. Use the following code double pounds2kilograms = 0.453592; 4. Method to convert kilograms to pounds and return the value. Use the following code double kilograms2pounds = 2.20462; 5. Method to convert gallons to liters and return the value. Use the following code to convert double gallons2liters = 3.78541; 6. Method to convert liters to gallons and return the value. Use the following code to convert double liters2gallons = 0.264172;
import java.util.Scanner;

public class Q20_TEMPRATURECHANGE {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(fahrenheit));

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

        System.out.print("Enter weight in Pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(pounds));

        System.out.print("Enter weight in Kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(kilograms));

        System.out.print("Enter volume in Gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(gallons));

        System.out.print("Enter volume in Liters: ");
        double liters = sc.nextDouble();
        System.out.println("Liters to Gallons: " + convertLitersToGallons(liters));
    }
}
