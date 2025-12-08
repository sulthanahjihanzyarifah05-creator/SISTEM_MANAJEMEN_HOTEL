package gui;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class WeeklyReportFrame extends JFrame {

    public WeeklyReportFrame() {
        setTitle("Rekap Mingguan");
        setSize(600, 600);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();
        area.setEditable(false);

        JScrollPane scroll = new JScrollPane(area);
        add(scroll, BorderLayout.CENTER);

        // ====== BACA FILE rekap_mingguan.txt ======
        try (BufferedReader br = new BufferedReader(new FileReader("rekap_mingguan.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                area.append(line + "\n");
            }
        } catch (Exception e) {
            area.setText("Belum ada data rekap mingguan.");
        }
    }
}
