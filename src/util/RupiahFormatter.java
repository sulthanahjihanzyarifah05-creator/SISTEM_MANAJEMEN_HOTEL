
package util;

import java.text.NumberFormat;
import java.util.Locale;


public class RupiahFormatter {
    public static String format(double amount) {
        Locale indo = new Locale("id", "ID");
        NumberFormat nf = NumberFormat.getCurrencyInstance(indo);
        return nf.format(amount);
    }
}
