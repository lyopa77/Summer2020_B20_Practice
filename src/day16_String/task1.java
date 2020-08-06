package day16_String;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        String str = "I like to drink pepsi";
        String drink = str.substring(16);
        System.out.println(drink);
        String action = str.substring(11, 14+1);
        System.out.println("+++++++++++++");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
         String str1 =  input.next();//apple

        System.out.println("Enter second word");
        String str2 = input.next();//banana
       // String result = str1.substring(1).concat(str2.substring(1));
        String result = str1.substring(1)+str2.substring(1);
        System.out.println(result);
        System.out.println("=============");


    }
}
