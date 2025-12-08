package gui;

import javax.swing.*;
import service.BookingService;
import model.Guest;
import model.Room;

public class CheckInFrame extends JFrame {

    public CheckInFrame(BookingService booking) {
        setTitle("Check-In");
        setSize(380, 260);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel l1 = new JLabel("Nama Tamu:");
        l1.setBounds(30, 20, 120, 25);
        add(l1);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 20, 180, 25);
        add(nameField);

        JLabel l2 = new JLabel("Nomor Kamar:");
        l2.setBounds(30, 60, 120, 25);
        add(l2);

        JTextField roomField = new JTextField();
        roomField.setBounds(150, 60, 180, 25);
        add(roomField);

        JLabel l3 = new JLabel("Lama Menginap (malam):");
        l3.setBounds(30, 100, 160, 25);
        add(l3);

        JTextField nightsField = new JTextField();
        nightsField.setBounds(190, 100, 140, 25);
        add(nightsField);

        JButton btn = new JButton("Check-In");
        btn.setBounds(120, 150, 140, 35);
        add(btn);

        btn.addActionListener(e -> {
            String name = nameField.getText().trim();
            String roomText = roomField.getText().trim();
            String nightsText = nightsField.getText().trim();

            if (name.isEmpty() || roomText.isEmpty() || nightsText.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Semua field wajib diisi!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int roomNumber, nights;
            try {
                roomNumber = Integer.parseInt(roomText);
                nights = Integer.parseInt(nightsText);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Nomor kamar dan lama menginap harus angka!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

        
            Room r = booking.getRoom(roomNumber);

            if (r == null) {
                JOptionPane.showMessageDialog(this,
                        "Kamar tidak ditemukan!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (r.isBooked()) {
                JOptionPane.showMessageDialog(this,
                        "Kamar sudah ditempati!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Guest g = new Guest(name);

            try {
       
                booking.processCheckIn(r, g, nights);

                JOptionPane.showMessageDialog(this,
                        "Check-In berhasil!\n" +
                        name + " masuk ke kamar " + roomNumber,
                        "Sukses", JOptionPane.INFORMATION_MESSAGE);

                dispose();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        "Gagal check-in: " + ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
