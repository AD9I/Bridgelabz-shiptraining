// Q6_CarRental.java
// CarRental class with constructors and total cost calculation
public class Q6_CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static double dailyRate = 1000.0; // Example rate per day
    // ...existing code...
    public Q6_CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }
    public Q6_CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }
    public static void main(String[] args) {
        Q6_CarRental r1 = new Q6_CarRental();
        Q6_CarRental r2 = new Q6_CarRental("Alice", "SUV", 5);
        r1.display();
        r2.display();
    }
}
