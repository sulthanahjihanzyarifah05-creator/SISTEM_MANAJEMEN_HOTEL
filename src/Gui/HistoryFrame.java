package gui;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class HistoryFrame extends JFrame {

    public HistoryFrame() {
        setTitle("Riwayat Transaksi");
        setSize(600, 500);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();
        area.setEditable(false);

        JScrollPane scroll = new JScrollPane(area);
        add(scroll, BorderLayout.CENTER);

      
        try (BufferedReader br = new BufferedReader(new FileReader("riwayat_transaksi.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                area.append(line + "\n");
            }
        } catch (Exception e) {
            area.setText("Belum ada riwayat transaksi.");
        }
    }
}
