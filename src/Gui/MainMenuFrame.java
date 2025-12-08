package gui;

import javax.swing.*;
import model.Employee;
import service.BookingService;

public class MainMenuFrame extends JFrame {

    private BookingService booking;

    public MainMenuFrame(Employee emp, BookingService booking) {
        this.booking = booking;

        setTitle("Menu Utama - Hotel System");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Selamat Datang, " + emp.getName());
        label.setBounds(80, 20, 250, 30);
        add(label);

        JButton btnRooms = new JButton("Lihat Semua Kamar");
        btnRooms.setBounds(100, 70, 180, 30);
        add(btnRooms);

        JButton btnCheckIn = new JButton("Check-In");
        btnCheckIn.setBounds(100, 115, 180, 30);
        add(btnCheckIn);

        JButton btnCheckOut = new JButton("Check-Out");
        btnCheckOut.setBounds(100, 160, 180, 30);
        add(btnCheckOut);

        JButton btnHistory = new JButton("Export Riwayat");
        btnHistory.setBounds(100, 205, 180, 30);
        add(btnHistory);

        JButton btnRekap = new JButton("Rekap Mingguan");
        btnRekap.setBounds(100, 250, 180, 30);
        add(btnRekap);

     

        btnRooms.addActionListener(e -> new RoomListFrame(booking).setVisible(true));

        btnCheckIn.addActionListener(e -> new CheckInFrame(booking).setVisible(true));

        btnCheckOut.addActionListener(e -> new CheckOutFrame(booking, emp).setVisible(true));

        btnHistory.addActionListener(e -> {
            booking.exportHistoryToFile();
            new HistoryFrame().setVisible(true);
        });

    
        btnRekap.addActionListener(e -> {
            booking.exportWeeklyReport();
            new WeeklyReportFrame().setVisible(true);
        });
    }
}
