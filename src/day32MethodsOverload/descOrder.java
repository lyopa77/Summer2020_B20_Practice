package day32MethodsOverload;
import java.util.Arrays;

public class descOrder {
    public static void main(String[] args) {

    int[]scores = {100, 75, 50,60};
         scores = sortDescending(scores);
         double[] n1= {1.5, 2.5, 5.5};
         n1=sortDescending(n1);
        System.out.println(Arrays.toString(n1));
    }



    public static int[] sortDescending(int[]arr){

        Arrays.sort(arr);
        int [] arr2 = new int[arr.length];

        int k = arr.length-1;
        for (int i=0; i<=arr.length-1;i++){
            arr2[i]=arr[k];
            k--;}
    return arr2; }



    public static double [] sortDescending(double[]arr){
        Arrays.sort(arr);
        double [] arr2 = new double[arr.length];

        int k = arr.length-1;
        for (int i=0; i<=arr.length-1;i++){
            arr2[i]=arr[k];
            k--;}
        return arr2; }

    }

