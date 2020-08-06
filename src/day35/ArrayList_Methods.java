package day35;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
list.add("jo");
list.add("vi");
list.add("al");
list.add("mi");
list.set(2, "ro");
        System.out.println(list);
list.clear();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("========");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.remove(2);
        System.out.println(list2);
Integer a =1;
list2.remove(a);
        System.out.println(list2);
        System.out.println("++++++++");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(6);

        list3.remove(1);
        System.out.println(list3);

    }
}
