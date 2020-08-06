package day14_recap;
import java.util.Scanner;
public class nextlineOther {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter gender ");
        String gender = input.next();

        System.out.println("enter age");
        int age = input.nextInt();

        input.nextLine();//enter, enter

        System.out.println("enter country name");
        String country = input.nextLine();

        System.out.println("enter zip ");
        int zip = input.nextInt();
         input.next();//Enter, enter

        System.out.println("enter full name");
        String name = input.nextLine();

        System.out.println("");





    }

}
