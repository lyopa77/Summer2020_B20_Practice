package day08_logicalOperators;

public class post_pre {
    public static void main(String[] args) {
        //3. manually calculate the following code fragments:
        //                1. int a = 200;
        //                    int b = -a++ + - --a * a-- % 2
        //                    b = ?
        //                2. int x = 300;
        //                   int y = 400;
        //                   int z = x + y - x * y +x / y;
        int a = 200;
        int b = -a++ + - --a * a --% 2;
        //b = -200  - 200  * 200  %2;
        //b = -200 - 40000 % 2
        //b = -200 - 0 = -200;
        int x = 300;
        int y = 400;
        int z = ((x + y) - (x * y)) + (x / y);

        System.out.println(b);
        System.out.println(z);

    }
}
