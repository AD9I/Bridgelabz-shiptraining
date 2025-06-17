import java.util.*;

public class Q33_NUMBERCHECK {
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

    static int sumOfDigits(int[] d) {
        int s = 0;
        for (int x : d) s += x;
        return s;
    }

    static int sumOfSquares(int[] d) {
        int s = 0;
        for (int x : d) s += Math.pow(x, 2);
        return s;
    }

    static boolean isHarshad(int n, int[] d) {
        int s = sumOfDigits(d);
        return n % s == 0;
    }

    static int[][] digitFrequency(int[] d) {
        int[] f = new int[10];
        for (int x : d) f[x]++;
        int[][] res = new int[10][2];
        for (int i = 0; i < 10; i++) {
            res[i][0] = i;
            res[i][1] = f[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] d = getDigits(num);
        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Sum of digits: " + sumOfDigits(d));
        System.out.println("Sum of squares: " + sumOfSquares(d));
        System.out.println("Is Harshad: " + isHarshad(num, d));
        int[][] freq = digitFrequency(d);
        System.out.println("Digit\tFreq");
        for (int[] row : freq)
            if (row[1] > 0)
                System.out.println(row[0] + "\t" + row[1]);
    }
}
