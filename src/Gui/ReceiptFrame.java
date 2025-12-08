
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.print.*;
import util.RupiahFormatter;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

public class ReceiptFrame extends JFrame {

    public ReceiptFrame(
            String guestName,
            int roomNumber,
            String checkIn,
            String checkOut,
            double pricePerNight,
            int nights,
            double total,
            String paymentMethod,
            String employeeName
    ) {

        setTitle("Struk Pembayaran");
        setSize(390, 450);
        setLocationRelativeTo(null);
        setLayout(null);

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setFont(new Font("Monospaced", Font.PLAIN, 13));

        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(10, 10, 355, 350);
        add(scroll);

   
        String line1 =  "===========================";
        String line2 =  "       STRUK PEMBAYARAN         ";
        String line3 =  "---------------------------";

        String fNm   = String.format("Nama  : %-22s", truncate(guestName,22));
        String fKmr  = String.format("Kamar : %03d", roomNumber);
        String fIn   = String.format("In    : %-16s", truncate(checkIn,16));
        String fOut  = String.format("Out   : %-16s", truncate(checkOut,16));

        String fRate = String.format("Rate  : %-20s", RupiahFormatter.format(pricePerNight));
        String fNight= String.format("Mlm   : %d", nights);
        String fTot  = String.format("TOTAL : %-20s", RupiahFormatter.format(total));

        String fPay  = String.format("Pay   : %-20s", paymentMethod);
        String fKas  = String.format("Pgwai : %-20s", employeeName);

        String end1 =  "--------------------------";
        String end2 =  "Terima kasih telah menginap!";
        String end3 =  "==========================";

        String struk =
                line1 + "\n" +
                line2 + "\n" +
                line3 + "\n" +
                fNm   + "\n" +
                fKmr  + "\n" +
                fIn   + "\n" +
                fOut  + "\n" +
                fRate + "\n" +
                fNight+ "\n" +
                line3 + "\n" +
                fTot  + "\n" +
                fPay  + "\n" +
                fKas  + "\n" +
                line3 + "\n" +
                end2  + "\n" +
                end3;

        area.setText(struk);

        JButton btnClose = new JButton("Tutup");
        btnClose.setBounds(230, 370, 120, 30);
        add(btnClose);
        btnClose.addActionListener(e -> dispose());

        JButton btnPrint = new JButton("Print");
        btnPrint.setBounds(60, 370, 120, 30);
        add(btnPrint);
       btnPrint.addActionListener(e -> {
    try {
        gui.ThermalPrinter.print(struk);
        JOptionPane.showMessageDialog(this, "Struk berhasil dicetak!");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Gagal mencetak: " + ex.getMessage());
    }
});
    }

   
    private String truncate(String text, int max) {
        if (text == null) return "-";
        if (text.length() <= max) return text;
        return text.substring(0, max);
    }

    
   private void printReceipt(String text) {
    try {
        String printerName = "POS58 Printer"; 

        PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
        PrintService selected = null;

     
        for (PrintService ps : services) {
            if (ps.getName().equalsIgnoreCase(printerName)) {
                selected = ps;
                break;
            }
        }

        if (selected == null) {
            JOptionPane.showMessageDialog(this,
                    "Printer thermal TIDAK ditemukan!\nNama dicari: " + printerName,
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

     
        DocPrintJob job = selected.createPrintJob();
        if (job == null) {
            JOptionPane.showMessageDialog(this,
                    "Printer ditemukan, tetapi TIDAK bisa dipakai!\n(Tidak terhubung / USB dicabut)",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        byte[] bytes = text.getBytes("UTF-8");
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        Doc doc = new SimpleDoc(bytes, flavor, null);

     
        job.print(doc, null);

        JOptionPane.showMessageDialog(this,
                "Struk BERHASIL dicetak!",
                "Sukses", JOptionPane.INFORMATION_MESSAGE);

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this,
                "Gagal mencetak!\n" + ex.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}

}
