package day33;

import java.util.Scanner;

public class wrapperClassPractice2 {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println(a);

        byte b = Byte.MAX_VALUE;
        System.out.println(b);

        int a2 = Integer.MIN_VALUE;
        System.out.println(a2);
        System.out.println("=========");
Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=1;i<=5;i++){
            System.out.println("enter number");
            int n =scan.nextInt();
            if(n>max){max=n;}
            if (n<min){min=n;}
        }
        System.out.println("max: "+max);
        System.out.println(("min: "+min));


    }
}
