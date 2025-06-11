import java.util.*;
public class question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fee = in.nextInt();
        int d = in.nextInt();
        int dis = fee * d / 100;
        System.out.println("The discount amount is INR " + dis + " and final discounted fee is INR " + (fee - dis));
    }
}
