public class Q35_COLLINEAR {
    static boolean isCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int s1 = (y2 - y1) * (x3 - x2);
        int s2 = (y3 - y2) * (x2 - x1);
        return s1 == s2;
    }

    static boolean isCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;
        System.out.println("Using Slope: " + isCollinearSlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Using Area: " + isCollinearArea(x1, y1, x2, y2, x3, y3));
    }
}
