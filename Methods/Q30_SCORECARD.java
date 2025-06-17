import java.util.*;

public class Q30_SCORECARD {
    static int[][] generateScores(int n) {
        Random r = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = r.nextInt(90) + 10;
            scores[i][1] = r.nextInt(90) + 10;
            scores[i][2] = r.nextInt(90) + 10;
        }
        return scores;
    }

    static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] result = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double perc = Math.round((total / 300.0 * 100.0) * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = perc;
        }
        return result;
    }

    static void printScorecard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) System.out.print(scores[i][j] + "\t\t");
            for (int j = 0; j < 3; j++) System.out.print(results[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] scores = generateScores(num);
        double[][] results = calculateResults(scores);
        printScorecard(scores, results);
    }
}

