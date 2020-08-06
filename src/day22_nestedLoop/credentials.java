package day22_nestedLoop;

import java.util.Scanner;

//username:cyber  pass:tek123
public class credentials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");
        String u = scan.next();

        System.out.println("password");
        String p = scan.next();
         int attempt = 0;

        while (!(u.equals("cyber")&&p.equals("tek123"))){
            if(attempt==3){
                System.out.println("account locked");
                System.exit(0);
            }
            System.out.println("invalid, please re-enter");
            System.out.println("Enter username");
            u=scan.next();
            System.out.println("Enter password");
            p=scan.next();
            attempt++;}
            System.out.println("logged in");

        }





}
