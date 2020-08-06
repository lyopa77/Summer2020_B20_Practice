package day08_logicalOperators;

public class practice3 {
    public static void main(String[] args) {
int b =2;
boolean res = b++ ==2 ||--b==2;
        System.out.println(res);
        System.out.println(b);
        int c = 5;
        boolean r2 = c++ ==6||c--==5;
        //       r2= 5 ==6   ||6 ==5;
        //       r2 =   false||false;
        System.out.println(r2);


    }
}
