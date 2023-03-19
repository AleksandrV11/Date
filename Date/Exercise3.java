package Date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise3 {
    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);
        System.out.println("------------------");
        System.out.println(time(ZonedDateTime.now(zoneId)));
    }

    public static ZonedDateTime time(ZonedDateTime zona) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.from(zona));
        return zonedDateTime;
    }
}
