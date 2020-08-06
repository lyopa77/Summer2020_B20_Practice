package day09;

public class minimum_number {
    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        double c = 30;
        boolean aIsMin = a <b && a<c;
        boolean bIsMin = !aIsMin && b < c;
        boolean cIsMin = !aIsMin && !bIsMin;
        double min = 0;
        if (aIsMin) { min = a;}
        if (bIsMin) {min = b;}
        if (cIsMin) {min = c;}
        System.out.println(min + " is min");





    }
}
