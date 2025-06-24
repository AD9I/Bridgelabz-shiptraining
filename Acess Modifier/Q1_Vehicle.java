// Q1_Vehicle.java
// Vehicle Registration: Instance vs. Class Variables and Methods
public class Q1_Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000.0;

    public Q1_Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Q1_Vehicle v1 = new Q1_Vehicle("John", "Car");
        Q1_Vehicle v2 = new Q1_Vehicle("Alice", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Q1_Vehicle.updateRegistrationFee(6000.0);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
