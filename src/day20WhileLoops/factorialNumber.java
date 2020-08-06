package day20WhileLoops;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int result = 1;
        for (int i = scan.nextInt(); i>=1;i--) {
            result *= i;
        }
        System.out.println(result);

    }

}
