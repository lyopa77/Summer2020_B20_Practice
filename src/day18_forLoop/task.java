package day18_forLoop;


    import java.util.Scanner;
    public class task {

        public static void main(String[] args) {
            //WRITE YOUR CODE HERE
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter vehicle's year");
            int year = scan.nextInt();
            Boolean recall = (year >=1995 && year<=1998)||(year==2001)
                    ||(year==2002)||(year>=2004&&year<=2006)||(year>=2015&&year<=2017);
            if (recall) {System.out.println("Your vehicle needs to be recalled");}else{System.out.println("Your vehicle is fine, enjoy!");}


        }
    }

