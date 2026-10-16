package rush.model;

import java.util.Locale;

/** Format money */
public class Money {
    private Money() {
    }

    public static String format(int cents) {
        String sign = cents < 0 ? "-" : "";
        int abs = Math.abs(cents);
        return String.format(Locale.ROOT, "%s$%d.%02d", sign, abs / 100, abs % 100);
    }
}
