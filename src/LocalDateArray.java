import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateArray {
    public static void main(String[] args) {
        String [] students = {"al", "be", "ce"};
        LocalDate[] birthDays = {
                    LocalDate.of(1982, 7, 20),
                LocalDate.of(1993,11,25),
                LocalDate.of(2020, 12,12)
        };
    for (int i=0; i<=students.length-1;i++){
        System.out.println(students[i]+" : "+birthDays[i]);
    }
        System.out.println("================");
    for (LocalDate each :birthDays){if (!each.isLeapYear())
        System.out.println(each);}
        LocalDateTime t3 = LocalDateTime.of(2020,7,25,15,37,20);
        System.out.println(t3);
        System.out.println(LocalDateTime.now());

    }}
