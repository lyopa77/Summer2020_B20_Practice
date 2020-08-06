package day21Loops;

import sun.tools.java.ScannerInputReader;

import java.util.Scanner;

public class minNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 999999999;
        for(int i = 1; i<=5;i++) {
            System.out.println("enter number");
            int num = scan.nextInt();
            if (num < min) {
                min = num;
            }
        }System.out.println(min);




    }
}
