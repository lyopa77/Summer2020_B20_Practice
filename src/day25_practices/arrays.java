package day25_practices;
import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        int []numbers = new int[100];
        for (int i=0; i<=numbers.length-1;i++){
            numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));
        for (int each:numbers){
            if (each % 2 == 0) {
                continue;
            }
            System.out.print(each+" ");
        }
    }

}
