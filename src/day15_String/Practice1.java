package day15_String;
import java.util.Scanner;
public class Practice1 {
    //write program that asks the user to write first name, last name
    //print initials of first and last name
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first name");
String firstName = input.next();//Cybertek
     char ch1 =   firstName.charAt(0);
        System.out.println("Enter your last name");
        String lastName = input.next();
        char ch2 = lastName.charAt(0);
        System.out.println(ch1 + " "+ch2);

        //length()==int
        int l = firstName.length();
        System.out.println(l);


    }

}
