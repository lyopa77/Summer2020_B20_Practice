package day33;
import java.util.ArrayList;
public class PracticeList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(30);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer each:list){
            if(each>max){max =each;}

        if(each<min){min=each;}}
            System.out.print(max+"  ");
            System.out.print(min+"  ");

    }
}
