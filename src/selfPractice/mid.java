package selfPractice;

import java.util.Scanner;

public class mid {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter word");
            String word = scan.next();

            int indexes = word.length();
            int mid = (indexes/2);
            if (indexes <5 || indexes==0){System.out.println("invalid");}else
                {System.out.println(word.substring(mid -1, mid+2));}

        }}
