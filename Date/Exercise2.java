package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        String date = "22.11.2222";
        System.out.println(dateFormatting(date));
    }

    public static LocalDate dateFormatting(String date) {

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dateTimeFormatter5 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter dateTimeFormatter6 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<DateTimeFormatter> dateTimeFormatters = List.of(dateTimeFormatter1, dateTimeFormatter2
                , dateTimeFormatter3, dateTimeFormatter4, dateTimeFormatter5, dateTimeFormatter6);

        for (DateTimeFormatter form : dateTimeFormatters) {
            try {
                return LocalDate.parse(date, form);

            } catch (Exception ignorable) {
            }
        }
        return null;
    }
}
