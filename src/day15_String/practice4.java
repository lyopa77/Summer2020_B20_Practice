package day15_String;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first name");

      String firstName = input.next();
        System.out.println("Enter last name");
        String lastName = input.next();
        String fullName = firstName + " "+lastName;
        fullName = fullName.toUpperCase();
        System.out.println(fullName);



    }

}
