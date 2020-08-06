package day32MethodsOverload;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatting {

    public static void main(String[] args) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
     LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.format(dateFormat));
        System.out.println("++++++++++++");



DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");
       LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));

        DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");
             LocalDateTime time1 = LocalDateTime.of(2019,5, 7,16,30 );
        System.out.println(time1);
        System.out.println(time1.format(dtformat));


}}
