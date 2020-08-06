package day07_unary_shorthand;

public class postVsPre {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);//11
        System.out.println(--a);//9
        System.out.println("-----------");

        int b = 10;
        System.out.println(b++);//10
        System.out.println(b);//11
        System.out.println("==============");

        int c =25;
        int d = c++;// d = 25;
        //c = 26;
        System.out.println("=========+++++");

        int e = 25;
        e++;
        System.out.println(e);
        System.out.println("++++++++++++++");
int A = 1;
A = -A-- + A++ / -A--*--A;
        System.out.println(A);
        System.out.println("----------");

int z = 50; //z=50
z = --z + z++ + z-- + z++;
//z=   49 + 49 + 50 + 49
        //z = 197
        System.out.println(z);
        System.out.println("!!!!!!!!!");
int x =4;
int y = x*4-x++;
        System.out.println("y = " + y);







    }
}
