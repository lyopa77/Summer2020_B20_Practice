package day18_forLoop;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter name");
        String str = scan.next();
  String s1 = str.substring(1);
  String s2 = str.substring(0,1);
        System.out.println(s1+s2);


    }

}
