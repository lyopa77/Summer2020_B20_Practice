package day08_logicalOperators;

public class practice_2 {
    public static void main(String[] args) {
       String firstName = "Alexey";
       String lastName = "Vines";
        int age =18;
        String citizen1 = "USA";
        String citizen2 = "France";
        boolean eligibleAge = age >17;
        boolean usCitizen = citizen1 =="USA"||citizen2 == "USA";
boolean eligibleToVote = eligibleAge && usCitizen;
String fullName = firstName + " " + lastName;
        System.out.println(fullName + " is eligible to vote: "+ eligibleToVote);


    }

}
