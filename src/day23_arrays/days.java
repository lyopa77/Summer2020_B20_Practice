package day23_arrays;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        String [] days = new String[7];
        days[6]="Sun";
        days[1]="Tue";
        days[2]="wed";
        days[3]="thurs";
        days[0]="mon";
        days[4]="fri";
        days[5]="sat";
        for(int i = 0;i<=days.length-1;i++ )
            System.out.println(days[i]+" ");
        System.out.println();
        System.out.println("============");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number 1-7");
        int n = scan.nextInt();
        System.out.println(days[n-1]);


    }

}
