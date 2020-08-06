package day09;



//1. write a java program that accepts three numbers and return the maximum number
//                (assume that none of them are equal)
public class maximum_number {
    public static void main(String[] args) {
        double a = 50;
        double b = 65;
        double c = 20;
        boolean aIsMax = a >b && a >c;
        boolean bIsMax = aIsMax == false && b>c;
        //      bIsMAx == !aIsMax && !cIsMax;
        boolean cIsMax = aIsMax == false && bIsMax == false;
        double max = 0;//we want to assign the max number to var 'max'

            if (aIsMax) {
                max = a;
                //System.out.println(a);}
            }

            if (bIsMax) {
                max = b;
                //System.out.println(b);}
            }
                if (cIsMax) {
                    max = c;
                    //  System.out.println(c); }
                }

                System.out.println(max + " is max num");

            }}


