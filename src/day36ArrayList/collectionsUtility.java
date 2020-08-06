package day36ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class collectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(20);
        list.add(15);
        list.add(10);
        list.add(40);
        Collections.sort(list);
        System.out.println(list
        );


    }

}
