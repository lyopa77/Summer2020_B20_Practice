package day29_methods;
//age, citizen, name
public class eligToVote {
    public static void main(String[] args) {
        vote ("John", 28, true, "biden");
        vote("dan", 17, true, "trump");
    }
    public static void vote (String name, int age, boolean citizen, String presidentName ){
        boolean eligibleToVote = age >=18 && citizen==true;
        if(eligibleToVote){
            System.out.println(name+ " is eligible to vote for " + presidentName);} else{
            System.out.println("not eligible");}

    }

}
