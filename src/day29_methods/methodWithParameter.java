package day29_methods;

import java.util.Scanner;

public class methodWithParameter {
    public static void main(String[] args) {
        printHello(5);
        System.out.println("================");
        Scanner scan = new Scanner (System.in);
        System.out.println("enter birth year and current year");
        age (scan.nextInt(), scan.nextInt());
    }
    public static void printHello(int numberOfTimes
    ){
        for (int i=0; i<numberOfTimes;i++){
            System.out.println("hello world");
        }
    }

    public static void age (int birthYear, int currentYear){
        if (currentYear<birthYear){
            System.out.println("invalid entry");}else{
   int age = currentYear -birthYear;
        System.out.println("you are "+ age +" years old");
    }
}}
