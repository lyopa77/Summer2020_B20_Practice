import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class BulkOps2 {
    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<>();
        names.addAll(Arrays.asList("ah", "ah", "al", "be"));
        System.out.println(names);
        names.removeAll((Arrays.asList("ah")));
        System.out.println(names);


    }
}
