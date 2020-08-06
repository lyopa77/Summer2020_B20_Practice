package day14_recap;
import java.util.Scanner;

public class nextLine_vs_otherMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = input.nextInt();

         input.nextLine();

        System.out.println("Enter your full name");
        String name = input.nextLine();

        System.out.println("Enter your co name");
        String coName = input.nextLine();
        
        System.out.println("Name: "+name + " Age: "+age+ " Company: "+coName);


    }

}
