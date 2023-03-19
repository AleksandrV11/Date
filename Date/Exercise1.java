package Date;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exercise1 {
    public static void main(String[] args) throws ParseException {
        String dateOfBirth = "20-02-2014";
        int days = countingDays(dateOfBirth);
        System.out.println(days);

    }

    public static int countingDays(String a) {
        int days = 0;
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate1 = LocalDate.parse(a,date);
        days = (int) ChronoUnit.DAYS.between( localDate1, localDate);
        return days;
    }
}
