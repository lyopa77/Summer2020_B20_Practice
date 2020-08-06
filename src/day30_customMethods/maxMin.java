package day30_customMethods;

import java.util.Arrays;

public class maxMin {
    public static void main(String[] args) {
int []arr = {1,2,3,2,5,6};
int num = max(arr);
        System.out.println(num);
        System.out.println(num>300);

    }
    public static int max(int []arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }

}
