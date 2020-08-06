package day15_String;

import java.util.Scanner;

public class prcatice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first name");
        String firstName = scan.next();

        System.out.println("Enter last name");
        String lastName = scan.next();

        //String fullName =firstName.concat(" ".concat(lastName));
        String fullName = firstName + " "+lastName;
        //System.out.println("You full name is ".concat(fullName));
        System.out.println("Your full name is: "+fullName);



    }

}
