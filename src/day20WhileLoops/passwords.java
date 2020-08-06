package day20WhileLoops;

import java.util.Scanner;

public class passwords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "Cybertek123";
        System.out.println("Enter password");
        String input = scan.nextLine();
        while(!input.equals(password)){
            System.out.println("re-enter password");
            input = scan.nextLine();

    }
        System.out.println("logged in");
}}
