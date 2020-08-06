package day13_ScannerContinued;

import java.util.Scanner;

public class next_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter first name");
        String firstName = scan.next();
        System.out.println("enter last name");
        String lastName = scan.next();
        String fullName = (firstName +" "+ lastName);
        System.out.println(fullName);




    }
}
