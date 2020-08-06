package day12_switch;




import java.util.Scanner;

public class userInputPractice {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        double num = scan.nextDouble();
        String result = (num % 2 == 0) ? "Number is " + num +" Even" : "Number is "+ num + " Odd";
        System.out.println(result);
    }

}
