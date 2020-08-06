package day07_unary_shorthand;

public class unary {
    public static void main(String[] args) {
        System.out.println(-1 + - 10);
        System.out.println(-1 - -10);
        System.out.println("-----------");
        int a = 20;
        --a;
        int b = 20;
        ++b;

        System.out.println(a);
        System.out.println(b);
    }
}
