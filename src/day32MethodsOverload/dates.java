package day32MethodsOverload;

import java.time.LocalDate;
import java.util.Scanner;

public class dates {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1977,
                8, 18);
        System.out.println(dob);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate y = LocalDate.of(2025, 7, 25);
        boolean result = y.isLeapYear();
        System.out.println(result);

        Scanner scan = new Scanner((System.in));
        System.out.println("enter year");
        int year = scan.nextInt();
        boolean result2 = LocalDate.of(2020, 7, 25).isLeapYear();
        System.out.println(result2);
        System.out.println("============");
        System.out.println("enter year, month, day");
        LocalDate d = LocalDate.of(scan.nextInt(),scan.nextInt(), scan.nextInt());
        System.out.println((d.isLeapYear()));
    }


}
