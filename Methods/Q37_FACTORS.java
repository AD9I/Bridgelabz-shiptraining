import java.util.*;

public class Q37_FACTORS {
    static int[] getFactors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) c++;
        int[] f = new int[c];
        int k = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) f[k++] = i;
        return f;
    }

    static int greatestFactor(int[] f) {
        int max = f[0];
        for (int x : f)
            if (x > max) max = x;
        return max;
    }

    static int sumOfFactors(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    static long productOfFactors(int[] f) {
        long p = 1;
        for (int x : f) p *= x;
        return p;
    }

    static double cubeProductOfFactors(int[] f) {
        double p = 1;
        for (int x : f) p *= Math.pow(x, 3);
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = getFactors(n);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest Factor: " + greatestFactor(f));
        System.out.println("Sum of Factors: " + sumOfFactors(f));
        System.out.println("Product of Factors: " + productOfFactors(f));
        System.out.println("Cube Product of Factors: " + cubeProductOfFactors(f));
    }
}

//         System.out.println("Digit\tFrequency");
//         for (int[] x : freq) System.out.println(x[0] + "\t" + x[1]);
//     }        
//     }
// }
