import java.util.*;
public class question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cm = in.nextDouble();
        double totalInch = cm / 2.54;
        int ft = (int)(totalInch / 12);
        double inch = totalInch % 12;
        System.out.printf("Your Height in cm is %.1f while in feet is %d and inches is %.2f", cm, ft, inch);
    }
}
