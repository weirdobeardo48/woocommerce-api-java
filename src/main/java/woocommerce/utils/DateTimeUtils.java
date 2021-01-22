package woocommerce.utils;

import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

public class DateTimeUtils {
    private static final DateTimeFormatter ISO_8601 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");

    public static LocalDateTime jsonDateStringToJavaDate(String date) {
        try {
            return LocalDateTime.parse(date, ISO_8601);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            return null;
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
    }
}
