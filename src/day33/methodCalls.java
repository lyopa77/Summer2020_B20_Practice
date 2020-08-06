package day33;
import library.util;

import java.util.Arrays;

public class methodCalls {
    public static void main(String[] args) {
        Integer[]arr1 ={1,2,3,4};
        Integer[]arr2 = {5,6,7,8};
        Integer[]arr3 = util.combine2Arrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

        Integer max = util.maxNum(arr3);
        System.out.println(max);

        int min = util.minNum(arr3);
        System.out.println(min);

        Character[]ch={'A', 'B','C'};
        ch = util.sortDescending(ch);
        System.out.println(Arrays.toString(ch));
    }
}
