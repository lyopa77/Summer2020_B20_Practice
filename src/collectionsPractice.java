import java.util.ArrayList;
import java.util.Collections;

public class collectionsPractice {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(10);
        list.add(50);
        list.add(60);


        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer>descList = new ArrayList<>();
        for (int i =list.size()-1; i>=0;i--){
           // System.out.print(list.get(i)+" ");
            descList.add(list.get(i));
        }
        System.out.println(descList);

        ArrayList<String>list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        System.out.println(list2);
        Collections.swap(list2,1, 2);
        System.out.println(list2);

        Collections.swap(list2, 0, list2.size()-1);
        System.out.println(list2);


    }
}
