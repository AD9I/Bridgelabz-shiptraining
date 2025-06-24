// Q4_HotelBooking.java
// HotelBooking class with default, parameterized, and copy constructors
public class Q4_HotelBooking {
    String guestName;
    String roomType;
    int nights;
    // ...existing code...
    public Q4_HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }
    public Q4_HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public Q4_HotelBooking(Q4_HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    public void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
    public static void main(String[] args) {
        Q4_HotelBooking b1 = new Q4_HotelBooking();
        Q4_HotelBooking b2 = new Q4_HotelBooking("John Doe", "Deluxe", 3);
        Q4_HotelBooking b3 = new Q4_HotelBooking(b2);
        b1.display();
        b2.display();
        b3.display();
    }
}
