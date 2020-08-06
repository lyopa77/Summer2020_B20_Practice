package day13_ScannerContinued;

import java.util.Scanner;

public class nextLine_vsNext {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();


    }
}
