package day37ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,1,3,3,4,5,6));
        System.out.println(list);
        for (int i=0;i<=list.size()-1;i++){
            list.remove(i);
        }
        System.out.println(list);
    }
}
