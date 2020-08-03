package day37ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class bulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        boolean r1 = list.contains(1);
        ArrayList<Integer>elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(4);
        boolean r2 = list.containsAll(elements);
        System.out.println(r2);
        System.out.println("===========");
        ArrayList<Integer>numbers = new ArrayList<>();
        Integer[]nums = {1,2,3,4,5};
        System.out.println("========");

        ArrayList<String>group1 = new ArrayList<>();
        group1.addAll(Arrays.asList("Al", "Be", "Ce"));
        boolean r3 = group1.containsAll(Arrays.asList("Al"));
        System.out.println(r3);
    }

}
