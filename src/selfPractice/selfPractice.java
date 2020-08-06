package selfPractice;

import static java.lang.System.*;

public class selfPractice {
    public static void main(String[] args) {
        String citizenship = "USA";
        int age = 17;
        boolean eligibleToVote = age > 17 && citizenship == "USA";
        boolean notEligibleToVote = !eligibleToVote;
        if (eligibleToVote == true) {
            out.println("Eligible to Vote");
        }
        if (notEligibleToVote == true) {
            out.println("Not eligible to vote");


        }
    }
}
