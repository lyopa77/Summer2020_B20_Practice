package day16_String;

import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first words");
        String first = input.next();

        System.out.println("enter second word");
        String second = input.next();

        boolean result = first.length() == 5 && second.length() == 5;
        if (result) {
            char ch1 = first.charAt((first.length()) - 1);//last character of the first word
            char ch2 = second.charAt(0); //first character of second word
            if (ch1 == ch2) {
                System.out.println("Fizz");
            } else {
                System.out.println("Buzz");
            }
        } else {
            System.out.println("need to be exactly 5 characters ");
        }
    }}