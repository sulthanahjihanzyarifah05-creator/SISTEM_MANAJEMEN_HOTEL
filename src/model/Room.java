package model;

public class Room {

    private int roomNumber;
    private double price;
    private boolean isBooked;
    private String guestName;
    private int nights;
    private String checkInTime;
    private String checkOutTime;

    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = false;
        this.guestName = "-";
        this.nights = 0;
    }

    public int getRoomNumber() { return roomNumber; }
    public double getPrice() { return price; }
    public boolean isBooked() { return isBooked; }
    public String getGuestName() { return guestName; }
    public int getNights() { return nights; }

    public void setCheckInTime(String t) { this.checkInTime = t; }
    public String getCheckInTime() { return checkInTime; }

    public void setCheckOutTime(String t) { this.checkOutTime = t; }
    public String getCheckOutTime() { return checkOutTime; }

    // === Format nomor kamar menjadi 001 / 002 / 010 / 123 ===
    public String getFormattedRoomNumber() {
        return String.format("%03d", roomNumber);
    }

    // ===== CHECK IN =====
    public void checkIn(String guestName, int nights) {
        this.isBooked = true;
        this.guestName = guestName;
        this.nights = nights;
    }

    // ===== CHECK OUT =====
    public void checkOut() {
        this.isBooked = false;
        this.guestName = "-";
        this.nights = 0;
    }

    // ===== TOTAL COST =====
    public double calculateTotalCost() {
        return price * nights;
    }

    public void showInfo() {
        System.out.println(
            "Kamar " + getFormattedRoomNumber() +
            " | Tipe: " + getClass().getSimpleName() +
            " | Harga: " + price +
            " | Status: " + (isBooked ? "BOOKED" : "AVAILABLE")
        );
    }
}
