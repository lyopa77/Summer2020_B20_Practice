package day33;

import java.util.Arrays;

public class arrayWrapper {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        Integer[] arr2 = {1,2,3,4};
        for ( int each:arr2){
            System.out.print(each);
        }

        double[] arr3= {1,2,3,4,5};
        Double[] arr4= {1.0,2.0,3.0,4.0,5.0};
        for(Double each:arr4){
            System.out.print(each);
            System.out.println();
        }
String [] nums1 = {"11", "12","13"};
        double [] nums2 = new double[nums1.length];
        for (int i=0;i<=nums1.length-1;i++){
           nums2[i]= Double.parseDouble(nums1[i]);
        }
        System.out.println(Arrays.toString(nums2));
    }
}
