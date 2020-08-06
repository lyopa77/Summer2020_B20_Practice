package day38recap;

import java.util.ArrayList;
import java.util.Arrays;
public class remove {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("bmw","bmw", "mercedes","vw", "gmc", "kia" ));
        //cars.remove(3);
        cars.removeAll(Arrays.asList("bmw"));
        System.out.println(cars);

        System.out.println("==========");

        ArrayList<String>list = new ArrayList<>();
        list.addAll(Arrays.asList("Carrot", "milk", "eggs", "salt", "pear"));
        System.out.println(list.contains("carrot"));
        System.out.println(list.containsAll(Arrays.asList("eggs", "salt")));
        System.out.println(list.size());
        list.set(list.size()-1, "ivy");
        System.out.println(list);
        list.set(list.indexOf("Carrot"),"apricot");
        System.out.println(list);
    }
}
