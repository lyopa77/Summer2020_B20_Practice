package day06_comparisonOperators;

public class implicit_explicit {

    public static void main(String[] args) {
short s1 = 100;
long l1 = s1;//implicit casting automatically done

long l2 =(long)s1;//if we done implicit manually
/////////////
double d1 = 400.5555;
int i1 = (int)d1;
        System.out.println(i1);

        long L1 = 4400;
        short sh1 = (short)L1;
        System.out.println(sh1);


        int n1 = 1000;
        byte b1 = (byte)n1;
        System.out.println(b1);//-24

        double m1 = 34.5;
        float f1 = (int)m1;
        System.out.println(f1);

        long r1 = -500;
        int p1 = (short)r1;
        System.out.println(p1);
long r2 = 13;
byte t1 = (byte)r2;
        System.out.println(t1);

    }
}
