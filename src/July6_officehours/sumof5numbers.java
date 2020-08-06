package July6_officehours;

import java.util.Scanner;

public class sumof5numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i =1;i<=5;i++){
        System.out.println("Enter a number:");
        int num1 = scan.nextInt();
        sum += num1;}
        System.out.println(sum);



    }

}
