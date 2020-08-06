package officeHoursJuly8th2020;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;

public class maxNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648;
       /* for (int i = 1; i <= 5; i++) {
            System.out.println("Enter number");
            int n = scan.nextInt();
            if (n > max) {
                max = n;
            }

        }

        */

        int j =1;
        while(j<=5){
            System.out.println("Enter number");
        int n= scan.nextInt();
        if(n>max){max=n;}
j++;
    }
        System.out.println(max);


}}
