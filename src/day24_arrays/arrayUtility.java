package day24_arrays;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
public class arrayUtility {
    public static void main(String[] args) {
String names [] = {"a", "b", "c","d","e"};

        System.out.println(Arrays.toString(names));
        System.out.println("======");
        int[]nums = {5,4,3,2,10,0};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("max num "+ nums[nums.length-1]);
        System.out.println("min num "+ nums[0]);
        String students []= {"A", "C","B"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

    }

}
