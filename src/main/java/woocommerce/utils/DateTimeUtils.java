package woocommerce.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {
    private static final SimpleDateFormat ISO_8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");

    public static Date jsonDateStringToJavaDate(String date) {
        try {
            return ISO_8601.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
