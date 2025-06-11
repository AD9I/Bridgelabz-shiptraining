public class question7 {
    public static void main(String[] args) {
        double r = 6378, v = (4.0 / 3) * Math.PI * Math.pow(r, 3);
        double vmi = v / Math.pow(1.609, 3);
        System.out.println("The volume of earth in cubic kilometers is " + v + " and cubic miles is " + vmi);
    }
}
