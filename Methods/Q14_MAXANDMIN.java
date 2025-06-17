// Write a program that generates five 4-digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max(). Hint => 1. Write a method that generates an array of 4-digit random numbers, given the size as a parameter, as shown in the method signature public int[] generate4DigitRandomArray(int size) 2. Write a method to find the average, min, and max values of an array public double[] findAverageMinMax(int[] numbers)
import java.util.*;

public class Q14_MAXANDMIN {
    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));

        double[] stats = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + rand.nextInt(9000);
        }
        return randomNumbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }
}