package officehoursJuly27;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;

public class combine2Arrays {
    public static void main(String[] args) {
        String [] arr1 = {"ab", "be", "ce", "de"};
        String [] arr2 = {"ee", "fe", "ge", "hh"};
        String [] arr3 = new String[arr1.length+arr2.length];

        for(int i=0; i<=arr1.length-1;i++){
            arr3[i]=arr1[i];}
        for(int j =0; j<=arr2.length-1;j++){
            arr3[j+arr1.length]= arr2[j];


        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("==================");



    }
}
