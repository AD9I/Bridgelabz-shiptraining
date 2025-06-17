import java.util.*;

public class Q38_MATRICESOPS {
    static int[][] createMatrix(int r, int c) {
        Random rand = new Random();
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = rand.nextInt(10);
        return m;
    }

    static int[][] addMatrix(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    static int[][] subtractMatrix(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int r1 = a.length, c1 = a[0].length, c2 = b[0].length;
        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    static void displayMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = createMatrix(r, c);
        int[][] b = createMatrix(r, c);
        int[][] c1 = createMatrix(c, r); // for multiplication to work

        System.out.println("Matrix A:");
        displayMatrix(a);
        System.out.println("Matrix B:");
        displayMatrix(b);

        System.out.println("A + B:");
        displayMatrix(addMatrix(a, b));

        System.out.println("A - B:");
        displayMatrix(subtractMatrix(a, b));

        System.out.println("A x C1:");
        displayMatrix(multiplyMatrix(a, c1));
    }
}
