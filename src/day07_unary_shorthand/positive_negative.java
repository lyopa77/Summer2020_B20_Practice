package day07_unary_shorthand;
//1. write a program that can verify if a number is positive, negative, 0
//        Positive_Negative_0
//        Ex:
//            number = 120
//        Output:
//            120 is a positive number? true
//            120 is negative number? false
//            120 ii zero? false

public class positive_negative {
    public static void main(String[] args) {
        double number = - 10;
        boolean result1 = (number > 0);
        boolean result2 = (number < 0);
        boolean result3 = (number == 0);
        System.out.println("number " + number + " is greater than 0: " + result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
