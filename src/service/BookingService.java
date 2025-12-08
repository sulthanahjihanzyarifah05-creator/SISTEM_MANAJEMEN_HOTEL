package service;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDate;

import model.Room;
import model.Guest;
import model.Transaction;
import model.StandardRoom;
import model.DeluxeRoom;

import util.Constants;
import util.RupiahFormatter;

public class BookingService {

    private Room[] rooms = new Room[Constants.MAX_ROOMS];
    private ArrayList<Transaction> history = new ArrayList<>();
    private String employeeName = "-";


    public void addRoom(Room room, int index) {
        rooms[index] = room;
    }

  
    public Room findRoomByNumber(int roomNumber) {
        for (Room r : rooms) {
            if (r != null && r.getRoomNumber() == roomNumber) {
                return r;
            }
        }
        return null;
    }

    public Room getRoom(int roomNumber) {
        return findRoomByNumber(roomNumber);
    }

 
    public void processCheckIn(Room room, Guest guest, int nights) throws Exception {

        if (room == null)
            throw new Exception("Kamar tidak ditemukan.");

        if (room.isBooked())
            throw new Exception("Kamar sudah ditempati.");

        if (nights <= 0)
            throw new Exception("Lama menginap harus lebih dari 0 malam.");

        String checkInTime = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));


        room.setCheckInTime(checkInTime);
        room.checkIn(guest.getName(), nights);


        addTransaction(
                guest.getName(),
                room.getRoomNumber(),
                nights,
                0,
                "CHECK-IN",
                "-",
                checkInTime,
                "-"
        );
    }
    
    public void addTransaction(String guest, int room, int nights, double total,
                               String type, String method,
                               String checkInTime, String checkOutTime) {

        String date = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));

        history.add(new Transaction(
                guest,
                room,
                nights,
                total,
                date,
                type,
                method,
                checkInTime,
                checkOutTime
        ));
    }

 
    public void checkIn(int roomNumber, Guest guest, int nights) throws Exception {
        Room r = findRoomByNumber(roomNumber);

        if (r == null)
            throw new Exception("Kamar tidak ditemukan.");

        if (r.isBooked())
            throw new Exception("Kamar sudah ditempati!");

        if (nights <= 0)
            throw new Exception("Lama menginap harus lebih dari 0 malam.");

        String checkInTime = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));

        r.setCheckInTime(checkInTime);
        r.checkIn(guest.getName(), nights);

        addTransaction(
                guest.getName(),
                roomNumber,
                nights,
                0,
                "CHECK-IN",
                "-",
                checkInTime,
                "-"
        );
    }


    public double checkOutWithMethod(int roomNumber, String method) throws Exception {

    Room r = findRoomByNumber(roomNumber);

    if (r == null)
        throw new Exception("Kamar tidak ditemukan.");

    if (!r.isBooked())
        throw new Exception("Kamar belum ditempati!");

    if (method == null || method.trim().isEmpty())
        throw new Exception("Metode pembayaran tidak boleh kosong.");


    String guest = r.getGuestName();
    int nights = r.getNights();
    double price = r.getPrice();
    double total = r.calculateTotalCost();

    String checkInTime = r.getCheckInTime();
    String checkOutTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    r.setCheckOutTime(checkOutTime);

    addTransaction(guest, roomNumber, nights, total, "CHECK-OUT", method, checkInTime, checkOutTime);

    
    r.checkOut();

    return total;
}


    public void generateReceipt(String guest, int roomNumber, double price,
                                int nights, double total, String method,
                                String checkInTime, String checkOutTime,
                                String employeeName) {
        try {
            String fileName = "struk_" + guest + "_" + roomNumber + ".txt";
            FileWriter writer = new FileWriter(fileName);

            writer.write("===== STRUK PEMBAYARAN HOTEL =====\n\n");
            writer.write("Resepsionis   : " + employeeName + "\n");
            writer.write("Nama Tamu     : " + guest + "\n");
            writer.write("No. Kamar     : " + roomNumber + "\n");
            writer.write("Check-In      : " + checkInTime + "\n");
            writer.write("Check-Out     : " + checkOutTime + "\n\n");
            writer.write("Harga/Malam   : " + RupiahFormatter.format(price) + "\n");
            writer.write("Lama Menginap : " + nights + " malam\n");
            writer.write("Total Biaya   : " + RupiahFormatter.format(total) + "\n");
            writer.write("Pembayaran    : " + method + "\n");
            writer.write("\n===== TERIMA KASIH =====\n");

            writer.close();

        } catch (Exception e) {
            System.out.println("Gagal membuat struk: " + e.getMessage());
        }
    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

 
    public void exportWeeklyReport() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    LocalDate today = LocalDate.now();
    LocalDate sevenDaysAgo = today.minusDays(7);

    try (FileWriter writer = new FileWriter("rekap_mingguan.txt")) {

        writer.write("========== REKAP MINGGUAN DETAIL ==========\n\n");

        double totalIncome = 0;
        int totalGuests = 0;
        int totalNights = 0;

        for (Transaction t : history) {

    
            if (!t.getType().equals("CHECK-OUT")) {
                continue;
            }

            LocalDate tDate;
            try {
                LocalDateTime ldt = LocalDateTime.parse(t.getDate(), dtf);
                tDate = ldt.toLocalDate();
            } catch (Exception e) {
                continue;
            }

            if (!tDate.isBefore(sevenDaysAgo) && !tDate.isAfter(today)) {

                writer.write("Tanggal : " + tDate + "\n");
                writer.write("Nama    : " + t.getGuestName() + "\n");
                writer.write("Kamar   : " + t.getRoomNumber() + "\n");
                writer.write("Malam   : " + t.getNights() + "\n");
                writer.write("Total   : " + RupiahFormatter.format(t.getTotalPrice()) + "\n");
                writer.write("----------------------------------------------\n\n");

                totalIncome += t.getTotalPrice();
                totalGuests++;
                totalNights += t.getNights();
            }
        }

        writer.write("\n===== KESIMPULAN =====\n");
        writer.write("Total Tamu       : " + totalGuests + "\n");
        writer.write("Total Malam      : " + totalNights + "\n");
        writer.write("Total Pendapatan : " + RupiahFormatter.format(totalIncome) + "\n");

    } catch (Exception ex) {
        System.out.println("Gagal membuat rekap: " + ex.getMessage());
    }
}
   
    public void showAllRooms() {
        System.out.println("\n===== STANDARD ROOM =====");
        for (Room r : rooms) {
            if (r instanceof StandardRoom) r.showInfo();
        }

        System.out.println("\n===== DELUXE ROOM =====");
        for (Room r : rooms) {
            if (r instanceof DeluxeRoom) r.showInfo();
        }
    }

    
    public void exportHistoryToFile() {
        try (FileWriter writer = new FileWriter("riwayat_transaksi.txt")) {

            writer.write("=== RIWAYAT TRANSAKSI HOTEL ===\n\n");
            for (Transaction t : history) {
                writer.write(t.toString() + "\n");
            }

            System.out.println("Riwayat berhasil diexport.");

        } catch (Exception e) {
            System.out.println("Gagal menyimpan file.");
        }
    }
}
