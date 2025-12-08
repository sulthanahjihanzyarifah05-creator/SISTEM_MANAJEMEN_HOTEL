package model;

public class Transaction {
    private String guestName;
    private int roomNumber;
    private int nights;
    private double totalPrice;
    private String date;
    private String type;
    private String method;        
    private String checkInTime;  
    private String checkOutTime;  

    public Transaction(String guestName, int roomNumber, int nights, double totalPrice,
                       String date, String type, String method,
                       String checkInTime, String checkOutTime) {

        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.nights = nights;
        this.totalPrice = totalPrice;
        this.date = date;
        this.type = type;
        this.method = method;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

   
    //        GETTER

    public String getGuestName() {
        return guestName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNights() {
        return nights;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public String getMethod() {
        return method;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }


    @Override
    public String toString() {
        return date + " | " + type +
                " | Tamu: " + guestName +
                " | Kamar: " + roomNumber +
                " | Malam: " + nights +
                " | Total: " + totalPrice +
                " | Pembayaran: " + method +
                " | Check-In: " + checkInTime +
                " | Check-Out: " + checkOutTime;
    }
}
