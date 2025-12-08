package gui;

import javax.print.*;

public class ThermalPrinter {

    public static void print(String text) throws Exception {

        PrintService printer = null;

        for (PrintService ps : PrintServiceLookup.lookupPrintServices(null, null)) {
            if (ps.getName().toLowerCase().contains("58") ||
                ps.getName().toLowerCase().contains("pos")) {
                printer = ps;
                break;
            }
        }

        if (printer == null)
            throw new Exception("Printer POS58 tidak ditemukan!");

   
        byte[] init = new byte[]{0x1B, '@'};

 
        byte[] content = text.getBytes("GB18030");

     
        byte[] feed = new byte[]{0x1B, 'd', 3}; 

      
        byte[] cut = new byte[]{0x1D, 'V', 1};


        byte[] finalBytes = new byte[init.length + content.length + feed.length + cut.length];

        System.arraycopy(init, 0, finalBytes, 0, init.length);
        System.arraycopy(content, 0, finalBytes, init.length, content.length);
        System.arraycopy(feed, 0, finalBytes, init.length + content.length, feed.length);
        System.arraycopy(cut, 0, finalBytes, init.length + content.length + feed.length, cut.length);

        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        Doc doc = new SimpleDoc(finalBytes, flavor, null);

        DocPrintJob job = printer.createPrintJob();
        job.print(doc, null);
    }
}
