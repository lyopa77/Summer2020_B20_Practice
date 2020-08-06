package selfPractice;
//ask03:
//    Write a program that can calcuate the grade based on the score
//        if score is between 90 to 100 ==> A
//        if score is between 80 to 90 ==> B
//        if score is between 70 to 80 ==> C
//        if score is between 60 to 70 ==> D
//        if score is below 60 ==> F
//        Ex: score = 85;
//            output:
//                Your grade is B
public class june16task3 {
    public static void main(String[] args) {
        int num1 = 58;
        if (num1 >89) {
            System.out.println("Your grade is A");}
        if (num1 >79 && num1 <90) {
            System.out.println("Your grade is B");}
        if (num1 > 69 && num1 < 80) {
            System.out.println("Your grade is C");}
        if (num1 > 59 && num1 < 70) {
            System.out.println("Your grade is D");}
        if (num1 < 60) System.out.println("Your grade is F");

        }


    }

