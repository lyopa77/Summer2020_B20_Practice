package day36ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        ArrayList<Character>list = new ArrayList<>();
        list.addAll(Arrays.asList('a','a','b','b', 'c'));
        System.out.println(list);

        ArrayList<Character> nonDup = new ArrayList<>();
        for(Character each:list){
            if(!nonDup.contains(each)){
                nonDup.add(each);
            }

        }
        System.out.println(nonDup);

    }
}
