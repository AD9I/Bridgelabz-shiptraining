import java.util.*;

public class Game {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    static int guess(int l, int h) {
        return r.nextInt(h - l + 1) + l;
    }

    static String feedback(int g) {
        System.out.println("Is your number " + g + "? (high/low/correct)");
        return sc.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        int l = 1, h = 100;
        while (true) {
            int g = guess(l, h);
            String f = feedback(g);
            if (f.equals("correct")) break;
            if (f.equals("high")) h = g - 1;
            else if (f.equals("low")) l = g + 1;
        }
        System.out.println("Yay! Guessed it 🎉");
    }
}
