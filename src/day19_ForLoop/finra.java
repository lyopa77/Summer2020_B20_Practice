package day19_ForLoop;

public class finra {
    public static void main(String[] args) {
        for (int i=1; i<=50;i++){
            if(i%3==0 &&i%5==0) {
                System.out.print("Finra ");
            }else if (i%3==0) {
                System.out.print("fin ");
            }else if (i%5==0){
                System.out.print("ra ");}
                else {
                System.out.print(i+" ");}

        }

    }
}
