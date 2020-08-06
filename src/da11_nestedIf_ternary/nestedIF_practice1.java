package da11_nestedIf_ternary;

public class nestedIF_practice1 {
    public static void main(String[] args) {
        double salary =25000;
        double jobHistory = 3;
        if (salary>=30000){
            if(jobHistory>=2){
                System.out.println("You are qualified");}else{
                System.out.println("you must have at least 2 years");}

        }else{
            System.out.println("You must earn at lease 30k");}



    }

}
