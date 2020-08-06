package day07_unary_shorthand;

public class leapYear {
    public static void main(String[] args) {
        int year = 2038;
        boolean result = year%4==0;
        System.out.println("Year " + year + " is a leap year: " + result);

    }

}
