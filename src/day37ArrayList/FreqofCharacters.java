package day37ArrayList;

import library.util;

import java.util.ArrayList;
import java.util.Collections;

public class FreqofCharacters {
    public static void main(String[] args) {
        String str = "AABBCDEE";
        ArrayList<String>list = new ArrayList<>();
        for (String each:str.split("")){
            list.add(each);
        }
        System.out.println(list);
        String nonDup = util.removeDup(str);
        for (String each:list){
        int count = Collections.frequency(list, each);
        System.out.println(each+count);
    }}
}
