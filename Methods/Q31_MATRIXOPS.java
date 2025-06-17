import java.util.*;

public class Q31_MATRIXOPS {
    static double[][] generateMatrix(int r, int c) {
        Random rand = new Random();
        double[][] mat = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = rand.nextInt(90) + 10;
        return mat;
    }

    static double[][] transpose(double[][] m) {
        int r = m.length, c = m[0].length;
        double[][] t = new double[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = m[i][j];
        return t;
    }

    static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;
        double[][] cof = new double[3][3];
        cof[0][0] = m[1][1]*m[2][2] - m[1][2]*m[2][1];
        cof[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        cof[0][2] = m[1][0]*m[2][1] - m[1][1]*m[2][0];
        cof[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        cof[1][1] = m[0][0]*m[2][2] - m[0][2]*m[2][0];
        cof[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);
        cof[2][0] = m[0][1]*m[1][2] - m[0][2]*m[1][1];
        cof[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        cof[2][2] = m[0][0]*m[1][1] - m[0][1]*m[1][0];
        double[][] adj = transpose(cof);
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[i][j] / det;
        return inv;
    }

    static void displayMatrix(double[][] m) {
        for (double[] row : m) {
            for (double v : row)
                System.out.printf("%8.2f", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        double[][] mat = generateMatrix(r, c);
        System.out.println("Matrix:");
        displayMatrix(mat);

        System.out.println("Transpose:");
        displayMatrix(transpose(mat));

        if (r == 2 && c == 2) {
            double det = determinant2x2(mat);
            System.out.println("Determinant: " + det);
            double[][] inv = inverse2x2(mat);
            System.out.println("Inverse:");
            if (inv == null) System.out.println("Matrix not invertible");
            else displayMatrix(inv);
        }

        if (r == 3 && c == 3) {
            double det = determinant3x3(mat);
            System.out.println("Determinant: " + det);
            double[][] inv = inverse3x3(mat);
            System.out.println("Inverse:");
            if (inv == null) System.out.println("Matrix not invertible");
            else displayMatrix(inv);
        }
    }
}

