package day29_methods;

public class returnKeyword {


    public static void main(String[] args) {
        grade(95);
        eligibleToBuy(20);
    }
    public static void grade (int score){
        if (score<0 || score >100) {
            System.out.println("invalid score");
            return;}
        char grade = (score >=90)? 'A': (score>=80)?'B':
                (score >=70)? 'C':(score>=60)?'D':'F';
            System.out.println(grade);
    }

    public static void eligibleToBuy (int age){
        if (age<21) {
            System.out.println("not eligible");
            return;}
        System.out.println("eligible to buy");

    }

}
