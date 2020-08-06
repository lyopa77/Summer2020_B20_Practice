package day37ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class uniques {
    public static void main(String[] args) {
        String str = "AABBCDDEE";
        ArrayList<String> list = new ArrayList<>();
        for (String each : str.split("")) {
            list.add(each);
        }
        System.out.println(list);
for ( String each:list){
        int count = Collections.frequency(list, each);
        if (count == 1) {
            System.out.println(each);
        }


    }}}
