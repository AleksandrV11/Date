package Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {

        String data1 = "2022-01-23 20:54";
        String data2 = "2024-02-24 17:32";
        String data3 = "2022-11-27 09:34";
        String data4 = "2022-11-27 09:33";
        List<String> strings = List.of(data1, data2, data3, data4);
        System.out.println(strings);
        System.out.println("_______________________________________________");
        System.out.println(maximus(strings));
    }

    public static LocalDateTime maximus(List<String> strings) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateTime = strings.stream()
                .map(a -> LocalDateTime.parse(a, dateTimeFormatter))
                .max(LocalDateTime::compareTo)
                .get();
        return localDateTime;
    }
}

















