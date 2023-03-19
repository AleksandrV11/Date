package Date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

import static java.time.Month.*;

public class Exercise6 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.parse("1990-10-11");
        System.out.println("Дата текущая " +date);
        System.out.println("Дата из строки "+date1);
        System.out.println("---------------------дни месяца---------------------------------------");
        System.out.println(date1.getMonth());
        System.out.println(date.getMonth());
        System.out.println("---------------------------------------------------------");
        System.out.println(date.getChronology());
        System.out.println("---------------------Все зоны -------------------");
        for (String a : ZoneId.getAvailableZoneIds()) {
            System.out.println(a);

        }
        System.out.println("start " + date);
        System.out.println(date.atStartOfDay());
        System.out.println(" perechod na sled mes +18 dney  " + date.plusDays(18));
        System.out.println(date.plusWeeks(2));
        System.out.println(date.plusYears(2));
        System.out.println("Finish " + date);
        System.out.println("Kogta " + date1.getDayOfWeek());
        System.out.println("----------------------------------------");
        System.out.println("<>=");
        System.out.println("----------------------------------------");
        System.out.println(date.isAfter(date1));
        System.out.println(date.isBefore(date1));
        System.out.println(date.equals(date1));
        System.out.println("prov na visokosn " + date1.isLeapYear());
        System.out.println("============WITH======izmenenie==================");
        System.out.println(date.with(ChronoField.YEAR, 1111));
        System.out.println(date);
        System.out.println(date.withYear(1953));
        System.out.println(date.withMonth(3));
        System.out.println(date.withDayOfYear(5));
        System.out.println(date);

        System.out.println("prov na visokosn " + date.isLeapYear());
        LocalDate day = date.withYear(1917);
        day = day.withDayOfMonth(1);
        day = day.withMonth(8);

        System.out.println(day);
        System.out.println(day.isLeapYear());
        System.out.println(day.getDayOfWeek());
        System.out.println("schet day " + date.getDayOfYear());
        System.out.println("day week " + date.getDayOfWeek());

        System.out.println("-------------------LocalTime--------------------");


        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(9, 34, 33);

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime.isAfter(localTime1));
        System.out.println(localTime.isBefore(localTime1));
        System.out.println(localTime.equals(localTime1));

        System.out.println("-------------------LocalDateTime--------------------");

        LocalDateTime localDateTime = date1.atTime(00, 1, 23);
        System.out.println(localDateTime);
        localDateTime = date1.atStartOfDay();
        System.out.println(localDateTime);
        LocalTime localTime7 = LocalTime.of(12, 45);
        LocalDateTime localDateTime1 = localTime7.atDate(date1);
        System.out.println(localDateTime1);
        System.out.println(localDateTime1.getDayOfWeek());
        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println("isAfter " + localDateTime1.isAfter(localDateTime2));
        System.out.println("isBefore " + localDateTime1.isBefore(localDateTime2));
        System.out.println("eguals " + localDateTime1.equals(localDateTime1));
        System.out.println("eguals " + localDateTime1.equals(localDateTime2));
        System.out.println("compareTo " + localDateTime1.compareTo(localDateTime2));

        System.out.println("-------------------Instant-----------------");
        Instant instant=Instant.now();
        System.out.println(instant);
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());

        System.out.println("-------------------Period-----------------");

        Period period = Period.of(2, 3, 4);
        System.out.println(period);
        Period period1 = Period.ofYears(4);
        System.out.println(period1);
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.plusDays(62);
        LocalDate date7 = localDate1.plusYears(7);
        Period period2 = Period.between(localDate,date7);
        System.out.println(period2);
        Period period3=Period.between(date7,localDate);
        System.out.println(period3);
        Period period4=period3.withYears(7).withMonths(2);
        System.out.println(period4);
        int year = period2.getYears();
        int mounth = period2.getMonths();
        int days = period2.getDays();

        LocalDate date9=LocalDate.of(year,mounth,days);
        System.out.println(year);
        System.out.println(mounth);
        System.out.println(day);
        System.out.println(date1);

        System.out.println("-------------------Duration-----------------");

        Duration duration = Duration.ofDays(3);
        System.out.println(duration);
        Duration duration1=Duration.ofMinutes(5);
        System.out.println(duration1);

        System.out.println("------------------- DateTimeFormatter -----------------");

        String data = "1917-02-14";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date4 = LocalDate.parse(data, dateTimeFormatter);
        System.out.println(date);

        LocalDateTime localDate6 = LocalDateTime.now();
        System.out.println(localDate6);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd-LLL-yy");
        System.out.println(localDate.format(dateTimeFormatter1));
       LocalDate localDate35=LocalDate.of(Integer.parseInt("2323"), FEBRUARY,22);


    }

}
