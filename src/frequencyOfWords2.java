import java.util.Scanner;

public class frequencyOfWords2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String word = scan.next();
        int l =word.length();
        int count =0; //(0,3)
        for (int i =0; i<=str.length()-l;i++){
            if(str.substring(i,i+l).equalsIgnoreCase("cat")){count++;
    }
}
        System.out.println(count);
    }}
