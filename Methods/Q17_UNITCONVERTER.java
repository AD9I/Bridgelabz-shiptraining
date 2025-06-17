public class Q17_UNITCONVERTER {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double mi) {
        return mi * 1.60934;
    }

    public static double convertMetersToFeet(double m) {
        return m * 3.28084;
    }

    public static double convertFeetToMeters(double ft) {
        return ft * 0.3048;
    }

    public static void main(String[] args) {
        double km = 10;
        double mi = 6.2;
        double m = 5;
        double ft = 16.4;

        System.out.println("Km to Miles: " + convertKmToMiles(km));
        System.out.println("Miles to Km: " + convertMilesToKm(mi));
        System.out.println("Meters to Feet: " + convertMetersToFeet(m));
        System.out.println("Feet to Meters: " + convertFeetToMeters(ft));
    }
}
