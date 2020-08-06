package day08_logicalOperators;

public class practice {
    public static void main(String[] args) {
        String firstName = "Alexey";
        String lastName = "Vines";
        int age = 43;
        String citizenship = "USA";
        boolean eligibleToVote = age >= 18 && citizenship == "USA";
        System.out.println(firstName + " " + lastName + " is eligible to vote: "+  eligibleToVote);


    }
}
