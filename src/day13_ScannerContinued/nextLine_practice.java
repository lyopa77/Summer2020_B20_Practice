package day13_ScannerContinued;

import java.util.Scanner;

public class nextLine_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter building #");
        int buildingNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter street name");
        String streetName = scan.nextLine();

        System.out.println(buildingNumber + " "+streetName);
scan.close();
    }
}
