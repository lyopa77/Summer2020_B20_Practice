package day18_forLoop;

import java.util.Scanner;

public class Email_domain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Email");
        String email = scan.next();
        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");
        String domain = email.substring(index1+1, index2);
        System.out.println(domain);


    }
}
