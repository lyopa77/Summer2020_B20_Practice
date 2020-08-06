package day37ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,4,4,5,6,7));
        //Predicate<Integer> lessThan5 = p ->p<5;
        list.removeIf(p-> p<5);
        System.out.println(list);
        System.out.println("============");


        Predicate <Integer> odd = p->p%2!=0;
        ArrayList<Integer>nums = new ArrayList<>();
        for (int i=0; i<=100;i++){
            nums.add(i);
        }
        nums.removeIf(odd); //remove odd numbers
        nums.removeIf(p->p%2==0); //remove if the number is even
        System.out.println(nums);
        System.out.println("===========");

        ArrayList<String>names = new ArrayList<>();
names.addAll(Arrays.asList("Mary", "Monica", "ALex"));
names.removeIf(each->each.startsWith("M")&& each.endsWith("y"));
        System.out.println(names);

    }
}
