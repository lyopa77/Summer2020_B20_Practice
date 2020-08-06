package day33;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter word");
        String str = scan.nextLine();
        String reverse = "";
        for (int i = str.length()-1; i>=0;i--)
        {reverse += str.charAt(i);}
        System.out.println(reverse);
    }
}
