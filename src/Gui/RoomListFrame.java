package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import service.BookingService;
import model.Room;

public class RoomListFrame extends JFrame {

    public RoomListFrame(BookingService booking) {
        setTitle("Daftar Kamar");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

        String[] columns = {"Nomor", "Harga", "Status", "Tamu", "Malam"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        for (int i = 1; i <= 20; i++) {
            Room r = booking.findRoomByNumber(i);
            if (r != null) {
              model.addRow(new Object[]{
                r.getFormattedRoomNumber(), 
                r.getPrice(),
                r.isBooked() ? "BOOKED" : "AVAILABLE",
                r.getGuestName(),
                r.getNights()
});
            }
        }

        JTable table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);
        add(scroll);
    }
}
