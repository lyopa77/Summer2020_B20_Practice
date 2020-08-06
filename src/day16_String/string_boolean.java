package day16_String;

import java.util.Scanner;

public class string_boolean {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Employed?");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("employed");}else{
            System.out.println("unemployed");


    }
}}
