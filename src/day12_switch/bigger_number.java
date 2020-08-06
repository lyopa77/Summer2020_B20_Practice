package day12_switch;

public class bigger_number {
    public static void main(String[] args) {
//1. write a program that checks for the bigger of 3 numbers.
//        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
//            if n1 is biggest output: "n1 is bigger"
//            if n2 is biggest output: "n2 is bigger"
//            if n3 is biggest output: "n3 is bigger"
//            example:
//                    n1 = -2
//                    n2  = 2
//                    n3  = 1
//                output: "n2 is bigger"
//            NOTE: DO NOT USE IF STATEMENT
        double n1 = 1;
        double n2 =2;
        double n3 = 3;
        boolean n1bigger = (n1>n2 && n1>n3);
boolean n2bigger = n2>n1 && n2>n3;
                  //n1bigger == false && n2>n3;
        String result = (n1bigger)? n1 + " is bigger":(n2bigger)? n2 + " is bigger": n3 + " is bigger";
        System.out.println(result);
        System.out.println("================");




    }

}
