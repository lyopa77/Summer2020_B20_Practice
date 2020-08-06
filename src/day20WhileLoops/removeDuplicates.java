package day20WhileLoops;

import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");

        String str = scan.nextLine();//ab
        String result = "";
        for(int i =0; i<=str.length()-1;i++){
            String s = ""+str.charAt(i);//a,a,b,b
            if(!result.contains(s)){
                result +=s;
            }

        }
        System.out.println(result
        );




    }

}
