package day25_practices;
import java.util.Arrays;
public class combineTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};
        int size = arr1.length+arr2.length;
        int[]arr3 = new int[size];
int index = 0;
for (int each:arr1){
    arr3 [index]=each;
    index+=1;
}
        for (int each:arr2){
            arr3[index]=each;
            index++;

    }
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("max:"+arr3[arr3.length-1]);
}}
