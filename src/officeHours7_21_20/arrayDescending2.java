package officeHours7_21_20;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class arrayDescending2 {
    public static void main(String[] args) {
        int [] arr = {3,4,5,2,1,7,500};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[]descArr = new int[arr.length];
        int k = arr.length-1;
        for (int each:arr){
            descArr[k]=each;
            k--;}
        System.out.println(Arrays.toString(descArr));
        }


}
