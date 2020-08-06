package day09;

public class mediumNumer {
    public static void main(String[] args) {
        double a = 40;
        double b = 20;
        double c = 30;
        boolean aIsMed = a < b && a> c || a >b && a <c;
        boolean bIsMed = b > a && b < c || b >c && b<a;
        boolean cIsMed = !(bIsMed && aIsMed);
        double med = 0;
        if (aIsMed) {med = a;}
        if (bIsMed) {med = b;}
        if (cIsMed) {med = c;}
        System.out.println(med + " is median.");

    }

}
