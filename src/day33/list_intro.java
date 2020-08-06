package day33;
import java.util.ArrayList;

public class list_intro {
    public static void main(String[] args) {
ArrayList< Integer > scores = new ArrayList<Integer>();
    scores.add(95); //autoboxing 0
    scores.add(100); //          1
        scores.add(85);        //2
scores.add(75);
scores.add(1,65);
scores.add(5,55);
        System.out.println(scores);
        System.out.println(scores.get(2));

    }
}
