package day23_arrays;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        String months []= {"Jan", "Feb", "March", "Apr", "May", "June", "July", "Aug", "Sep","Oct", "Nov", "Dec"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number");
        int num = scan.nextInt();
        System.out.println(months[num-1]);



    }
}
