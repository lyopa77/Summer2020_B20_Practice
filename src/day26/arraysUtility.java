package day26;

import java.util.Arrays;

public class arraysUtility {
    public static void main(String[] args) {
        String [] names = {"od", "li", "dem", "tri"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        int [] score ={1,2,3,4,5};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        System.out.println("max: "+score[score.length-1]);
        System.out.println("min: "+ score[0]);
        System.out.println("========");
        String [] s1 = {"a", "b", "c"};
        String [] s2= {"a", "b", "c"};
        System.out.println(Arrays.equals(s1, s2));
        System.out.println("========");
        String [] a1= {"a", "c", "b"};
        String [] a2 = {"b", "a", "c"};


    }
}
