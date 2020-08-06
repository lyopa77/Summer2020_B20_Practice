package day26;

public class divby3 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
        int countDivby3 = 0;
        for ( int each:arr ){
            if(each%3==0){continue;}
            countDivby3++;
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println(countDivby3);
}}
