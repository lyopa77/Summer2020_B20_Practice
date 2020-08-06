package day18_forLoop;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First name");
        String firstName = scan.next();

        System.out.println("Last name");
        String lastName = scan.next();

        String str1 = firstName.substring(0,1);
        String str2 = lastName.substring(0,1);
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        System.out.println(str1 + str2);

    }
}
