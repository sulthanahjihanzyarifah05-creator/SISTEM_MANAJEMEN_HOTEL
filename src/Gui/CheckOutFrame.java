package gui;

import javax.swing.*;
import service.BookingService;
import model.Room;
import model.Employee;
import util.RupiahFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckOutFrame extends JFrame {

    private BookingService booking;
    private Employee employee;


    private String lastGuest = null;
    private int lastRoomNumber = -1;
    private String lastCheckIn = null;
    private String lastCheckOut = null;
    private double lastPrice = 0;
    private int lastNights = 0;
    private double lastTotal = 0;
    private String lastPaymentMethod = null;

    private JButton printButton;

    public CheckOutFrame(BookingService booking, Employee employee) {
        this.booking = booking;
        this.employee = employee;

        setTitle("Check-Out - " + (employee != null ? employee.getName() : "-"));
        setSize(380, 320);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel l1 = new JLabel("Nomor Kamar:");
        l1.setBounds(30, 20, 120, 25);
        add(l1);

        JTextField roomField = new JTextField();
        roomField.setBounds(150, 20, 150, 25);
        add(roomField);

        JButton btn = new JButton("Proses");
        btn.setBounds(100, 70, 120, 35);
        add(btn);

        btn.addActionListener(e -> handleCheckOut(roomField));

   
        printButton = new JButton("Cetak Struk");
        printButton.setBounds(100, 130, 120, 35);
        printButton.setEnabled(false);
        add(printButton);

        printButton.addActionListener(e -> {
            if (lastGuest != null && lastRoomNumber != -1 && lastPaymentMethod != null) {
               
                new ReceiptFrame(
                        lastGuest,
                        lastRoomNumber,
                        lastCheckIn,
                        lastCheckOut,
                        lastPrice,
                        lastNights,
                        lastTotal,
                        lastPaymentMethod,
                        (employee != null ? employee.getName() : "-")
                ).setVisible(true);
            }
        });
    }

    private void handleCheckOut(JTextField roomField) {

        String txt = roomField.getText().trim();
        if (txt.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan nomor kamar!");
            return;
        }

        int roomNumber;
        try {
            roomNumber = Integer.parseInt(txt);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Nomor kamar harus angka!");
            return;
        }

        Room r = booking.getRoom(roomNumber);

        if (r == null) {
            JOptionPane.showMessageDialog(this, "Kamar tidak ditemukan!");
            return;
        }

        if (!r.isBooked()) {
            JOptionPane.showMessageDialog(this, "Kamar belum ditempati!");
            return;
        }

    
        String guest = r.getGuestName();
        int nights = r.getNights();
        double price = r.getPrice();
        String checkIn = r.getCheckInTime();

        
        String checkOut = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        double total = price * nights;

        String detail =
                "=== CHECK-OUT ===\n" +
                        "Nama Tamu       : " + guest + "\n" +
                        "No. Kamar        : " + r.getFormattedRoomNumber() + "\n" +
                        "Harga Per Malam : " + RupiahFormatter.format(price) + "\n" +
                        "Lama Menginap   : " + nights + " malam\n" +
                        "Total Biaya     : " + RupiahFormatter.format(total) + "\n\n" +
                        "Pilih Metode Pembayaran:";

        String[] methods = {"Cash", "QRIS", "Transfer"};
        String method = (String) JOptionPane.showInputDialog(
                this,
                detail,
                "Metode Pembayaran",
                JOptionPane.PLAIN_MESSAGE,
                null,
                methods,
                methods[0]
        );

        if (method == null) return; 

        try {
          
            booking.checkOutWithMethod(roomNumber, method);

          
            lastGuest = guest;
            lastRoomNumber = roomNumber;
            lastCheckIn = checkIn;
            lastCheckOut = checkOut;
            lastPrice = price;
            lastNights = nights;
            lastTotal = total;
            lastPaymentMethod = method;

          
            printButton.setEnabled(true);

            JOptionPane.showMessageDialog(
                    this,
                    "Check-Out berhasil!\nMetode pembayaran: " + method
            );

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
