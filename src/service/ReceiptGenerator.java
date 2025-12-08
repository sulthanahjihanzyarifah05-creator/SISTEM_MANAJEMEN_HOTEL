package service;

import java.io.FileWriter;

public class ReceiptGenerator {

    public static void generateReceipt(
            String guestName,
            int roomNumber,
            double price,
            int nights,
            double totalAmount,
            String paymentMethod,
            String checkInTime,
            String checkOutTime
    ) {
        try {
            String fileName = "receipt_" + guestName + "_" + roomNumber + ".txt";
            FileWriter writer = new FileWriter(fileName);

            writer.write("========== HOTEL RECEIPT ==========\n");
            writer.write("Nama Tamu       : " + guestName + "\n");
            writer.write("Nomor Kamar     : " + roomNumber + "\n");
            writer.write("Harga / Malam   : Rp " + price + "\n");
            writer.write("Lama Menginap   : " + nights + " malam\n");
            writer.write("Waktu Check-In  : " + checkInTime + "\n");
            writer.write("Waktu Check-Out : " + checkOutTime + "\n");
            writer.write("Metode Bayar    : " + paymentMethod + "\n");
            writer.write("-----------------------------------\n");
            writer.write("Total Bayar     : Rp " + totalAmount + "\n");
            writer.write("===================================\n");

            writer.close();
            System.out.println("Struk berhasil dibuat: " + fileName);

        } catch (Exception e) {
            System.out.println("Gagal membuat struk!");
        }
    }
}
