package day33;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class warmup {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MM/dd/yyyy " );
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        System.out.println(today.format(dtf));

    }
}
