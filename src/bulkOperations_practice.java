import java.util.ArrayList;
import java.util.Arrays;
public class bulkOperations_practice {
    public static void main(String[] args) {
        ArrayList<String>students = new ArrayList<>();
        students.add("Sa");
        students.add("De");
        students.add("Bu");
        students.add("Oh");
        students.add("Ra");

        boolean r1 = students.containsAll(Arrays.asList("Oh", "Sa"));
        System.out.println(r1);
        System.out.println("=======");
        ArrayList<Integer>nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,2,2,3,4,5,6,6));
        System.out.println(nums);
        nums.removeAll(Arrays.asList(1, 2));
        System.out.println(nums);
        System.out.println("++++++");
        System.out.println(nums);
nums.retainAll(Arrays.asList(5,6));
        System.out.println(nums);

    }
}
