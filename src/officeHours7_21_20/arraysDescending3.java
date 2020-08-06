package officeHours7_21_20;

import java.util.Arrays;
import java.util.Scanner;

public class arraysDescending3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers?");
        int size = scan.nextInt();

        int [] arr = new int[size];
        for (int i = 0; i<size;i++){
            System.out.println("enter a number");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println((Arrays.toString(arr)));
        int []descArr = new int [size];

        int k = arr.length-1;
        for (int each:arr){
            descArr[k]=each;
            k--;}
    }
}

