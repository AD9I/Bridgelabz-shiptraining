import java.util.*;

public class Q34_NUMCHECKERS {
    static int countDigits(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    static int[] getDigits(int n) {
        int c = countDigits(n);
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    static int[] reverseArray(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++)
            r[i] = d[d.length - 1 - i];
        return r;
    }

    static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    static boolean isPalindrome(int[] d) {
        int[] r = reverseArray(d);
        return arraysEqual(d, r);
    }

    static boolean isDuckNumber(int[] d) {
        for (int i = 1; i < d.length; i++)
            if (d[i] == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] d = getDigits(num);
        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Is Palindrome: " + isPalindrome(d));
        System.out.println("Is Duck Number: " + isDuckNumber(d));
    }
}
