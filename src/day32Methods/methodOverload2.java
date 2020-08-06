package day32Methods;

public class methodOverload2 {
    public static void main(String[] args) {
addition(3,5,10);
addition(2,4, 5);
    }
    public static void addition (double a, double b){
        System.out.println((a+b));
    }
    public static double addition (double a, double b, double c) {
        Double result = (a+b+c);
       return result;


}}
