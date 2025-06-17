import java.util.*;

public class Q32_NUMCHECKER {
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

    static boolean isDuck(int[] d) {
        for (int i = 1; i < d.length; i++)
            if (d[i] == 0) return true;
        return false;
    }

    static boolean isArmstrong(int[] d) {
        int sum = 0, len = d.length;
        for (int x : d) sum += Math.pow(x, len);
        int n = 0;
        for (int x : d) n = n * 10 + x;
        return sum == n;
    }

    static int[] findTwoLargest(int[] d) {
        int max = Integer.MIN_VALUE, sec = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > max) {
                sec = max;
                max = x;
            } else if (x > sec && x != max) {
                sec = x;
            }
        }
        return new int[]{max, sec};
    }

    static int[] findTwoSmallest(int[] d) {
        int min = Integer.MAX_VALUE, sec = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < min) {
                sec = min;
                min = x;
            } else if (x < sec && x != min) {
                sec = x;
            }
        }
        return new int[]{min, sec};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] d = getDigits(num);
        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Is Duck: " + isDuck(d));
        System.out.println("Is Armstrong: " + isArmstrong(d));
        int[] l = findTwoLargest(d);
        System.out.println("Largest: " + l[0] + " Second Largest: " + l[1]);
        int[] s = findTwoSmallest(d);
        System.out.println("Smallest: " + s[0] + " Second Smallest: " + s[1]);
    }
}
