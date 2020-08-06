package day23_arrays;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter 2 numbers");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            System.out.println("enter math operator");
            char o = input.next().charAt(0);

            double result = (o=='+')?num1+num2:(o=='-')?num1-num2:
                    (o=='*')?num1*num2:(o=='/')?num1/num2:(o=='%')?num1%num2:0;

            System.out.println(result);

            System.out.println("continue?");
            String a = input.next().toLowerCase();
            while (!(a.equals("yes")||(a.equals("no")))){
                System.out.println("invalid");
                System.out.println("continue?");
                a=input.next().toLowerCase();}
            if(a.equals("no")) {
                break;


            }
        }}}



