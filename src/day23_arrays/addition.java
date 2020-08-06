package day23_arrays;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("Enter 2 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = num1+num2;
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
