package day35;

import java.util.ArrayList;

public class ReverseOrder {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(0,3);
        list.add(5);
        System.out.println(list.size());
        System.out.println(list);

        for (int i=list.size()-1; i>=0;i--){
            System.out.print( list.get(i)+" ");
        }

    }
}
