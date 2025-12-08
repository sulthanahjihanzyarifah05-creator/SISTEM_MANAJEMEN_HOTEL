package Main;

import java.util.Scanner;
import model.*;
import service.BookingService;
import service.EmployeeService;
import model.Employee;

public class HotelApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // LOGIN PEGAWAI
        EmployeeService empService = new EmployeeService();
        Employee emp = null;

        System.out.println("===== LOGIN PEGAWAI HOTEL =====");
        System.out.print("Username : ");
        String user = in.nextLine();
        System.out.print("Password : ");
        String pass = in.nextLine();

        emp = empService.login(user, pass);

        if (emp == null) {
            System.out.println("Login gagal! Username atau password salah.");
            return;
        }

        System.out.println("Login berhasil! " + emp.getName());
        System.out.println();

        // INISIALISASI BOOKING SERVICE
        BookingService bk = new BookingService();
        bk.setEmployeeName(emp.getName());

        // Tambah daftar kamar
        for (int i = 0; i < 10; i++) bk.addRoom(new StandardRoom(i + 1), i);
        for (int i = 10; i < 20; i++) bk.addRoom(new DeluxeRoom(i + 1), i);

        int menu;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN HOTEL ===");
            System.out.println("Pegawai: " + emp.getName());
            System.out.println("-------------------------------");
            System.out.println("1. Lihat Semua Kamar");
            System.out.println("2. Check-In");
            System.out.println("3. Check-Out");
            System.out.println("4. Export Riwayat Transaksi");
            System.out.println("5. Rekap Laporan Mingguan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            menu = in.nextInt();

            switch (menu) {

                // -----------------------------------------
               case 1: // SHOW ALL ROOMS
                System.out.println("=== DAFTAR KAMAR ===");
                 for (int i = 1; i <= 20; i++) {
                  Room r = bk.findRoomByNumber(i);
                if (r != null) {
                 System.out.println("Kamar " + r.getRoomNumber()
                    + " | Harga: " + r.getPrice()
                    + " | Status: " + (r.isBooked() ? "Terisi" : "Kosong")
            );
        }
    }
    break;

                // -----------------------------------------
                case 2: // CHECK-IN
                    System.out.print("Nama tamu: ");
                    String name;
                    in.nextLine();  
                    name = in.nextLine();

                    System.out.print("Nomor kamar: ");
                    int rn = in.nextInt();

                    System.out.print("Berapa malam: ");
                    int nights = in.nextInt();

                    try {
                        bk.checkIn(rn, new Guest(name), nights);
                        System.out.println("Check-In berhasil!");
                    } catch (Exception ex) {
                        System.out.println("Gagal Check-In: " + ex.getMessage());
                    }
                    break;

                // -----------------------------------------
                case 3: // CHECK-OUT
                    System.out.print("Nomor kamar: ");
                    int outRoom = in.nextInt();

                    System.out.print("Metode pembayaran (Cash / QRIS / Transfer): ");
                    in.nextLine();
                    String method = in.nextLine().trim();

                    try {
                        double total = bk.checkOutWithMethod(outRoom, method);
                        System.out.println("Check-Out berhasil!");
                        System.out.println("Total dibayar: " + total);
                    } catch (Exception ex) {
                        System.out.println("Gagal Check-Out: " + ex.getMessage());
                    }
                    break;

                // -----------------------------------------
                case 4: // EXPORT HISTORY
                    bk.exportHistoryToFile();
                    System.out.println("Riwayat transaksi berhasil diexport!");
                    break;

                // -----------------------------------------
                case 5: // WEEKLY REPORT
                    bk.exportWeeklyReport();
                    System.out.println("Rekap mingguan berhasil dibuat!");
                    break;

                // -----------------------------------------
                case 6:
                    System.out.println("Terima kasih!");
                    break;
            }

        } while (menu != 6);

        in.close();
    }
}
