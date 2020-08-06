package selfPractice;
//Task02:
//    write a program that can calculate the grade.
//        1. if grade is bigger then 90 output "Excellent"
//        2. if the grade is bigger then 70 and smaller then 90 output "Good"
//        3. if grade is bigger then 60 and smaller then 70 output "Pass"
//        4. if grade is smaller then 60 output "Fail"
//        ex: score = 75
//            output:
//                Good
//        HINT: you will need && logic
public class jun16task2 {
    public static void main(String[] args) {
        int num1 = 40;
        if (num1 > 89) {
            System.out.println("Excellent");}
            if (num1 > 69 && num1 < 90) {
                System.out.println("Good");
            }
            if (num1 > 59 && num1 < 70) {
                System.out.println("Pass");
            }
            if (num1 < 60) {
                System.out.println("Fail");
            }


        }
    }
