package day30_customMethods;

import java.util.Arrays;

/*1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
*/
public class warmupTasks {
    public static void main(String[] args) {
        maxNum(1, 1);

        int arr []= {1,3,2,6,5,4, -10};
        printDescending(arr);

        int[]a1 = {1,2,3,4};
        int []a2 = {5,6,7,8};
        combine2Arrays(a1,a2);

        posNegZero(0);
        System.out.println("========");
        int []a3 = {1, -1, 0, 2, 5};
        for (int each:a3){
            posNegZero(each);}

    }
public static void maxNum(int a, int b){
    if (a==b){
        System.out.println("equal");
        return;}
        if(a>=b){
        System.out.println(a+ " is max");
}else{
        System.out.println(b+" is max");}

}
public static void printDescending (int []arr){
       Arrays.sort(arr);
    {
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

}

    }
public static void combine2Arrays (int[]arr1, int[]arr2){
    int[]arr3 = new int [arr1.length+arr2.length];
    int i = 0;
    for ( int each:arr1){
        arr3[i] = each;
        i++;
    }
    for (int each :arr2){
        arr3[i]= each;
        i++;
    }
    System.out.println(Arrays.toString(arr3));
    }
    public static void posNegZero(int num ){
        if (num>0){
            System.out.println(num + " is positive");}else if
        (num<0){
            System.out.println(num +" is negative");}
        else {
            System.out.println(num + " is zero");
        }

    }
}

