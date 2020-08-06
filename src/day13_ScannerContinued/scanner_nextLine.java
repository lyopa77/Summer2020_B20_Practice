package day13_ScannerContinued;


import java.util.Scanner;

public class scanner_nextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = scan.nextLine();


        String coName = scan.nextLine();
        System.out.println("Enter co name");
        System.out.println("Co name: "+ coName);

        System.out.println("Full name: "+ name);

    }

}
