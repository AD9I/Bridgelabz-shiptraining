import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9_NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter index: ");
            int idx = sc.nextInt();
            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();
            try {
                int value = arr[idx];
                try {
                    int result = value / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter numeric values only!");
        }
        sc.close();
    }
}
