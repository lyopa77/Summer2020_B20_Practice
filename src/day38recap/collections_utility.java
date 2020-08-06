package day38recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class collections_utility {
    public static void main(String[] args) {
        ArrayList<Character>chars = new ArrayList<>();
        chars.addAll(Arrays.asList('r','b','c','r','a','z'));
        System.out.println(chars);
        Collections.sort(chars);
        System.out.println(chars);
        System.out.println("+++++++++++++++");

        ArrayList<String> students = new ArrayList<>();
         students.addAll(Arrays.asList("Cr", "al", "bob", "na", "ti"));
        System.out.println(students);
        Collections.swap(students,1,2);
        System.out.println(students);
        Collections.swap(students, 0, students.size()-1);
        System.out.println(students);

        System.out.println("---------------");
        ArrayList<String>items = new ArrayList<>();
        items.addAll((Arrays.asList("pen", "egg", "egg", "cake", "tea", "tea")));
        int count = Collections.frequency(items, "egg");
        System.out.println(count);
        ArrayList<String>unique = new ArrayList<>();
        for ( String each:items){
            int i = Collections.frequency(items, each);
            if (i==1){unique.add(each);
        }
    }
        System.out.println(unique);

        ArrayList<String>unique2 = new ArrayList<>();
        unique2.addAll(items
        );
        System.out.println(items);
        unique2.removeIf(p->Collections.frequency(unique2,p)>1);
        System.out.println(unique2);

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1,4,6,9,3,2,10));
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);
        Collections.replaceAll(list, 1, 1000);
        System.out.println(list);
}}
