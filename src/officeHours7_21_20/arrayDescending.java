package officeHours7_21_20;

import java.util.Arrays;

public class arrayDescending {
    public static void main(String[] args) {
        int [] arr = {3,4,5,2,1,7,6,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int [] descArr = new int [arr.length];
        // descArr[0]= arr[6];
        int k =0;
        for (int i=arr.length-1; i>=0;i--){
            descArr[k]= arr[i];
            k++;
        }
            System.out.println(Arrays.toString(descArr));





    }

}
