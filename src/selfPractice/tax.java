package selfPractice;

public class tax {
    public static void main(String[] args) {
        double salary = 4000;
        boolean kids = true;
        boolean paysTaxes = salary > 39999.99;
        boolean doesNotPay = salary < 40000 && kids == true;
        if (paysTaxes==true) {
            System.out.println("Pays taxes");}
            if (doesNotPay == true) {
            System.out.println("Does not pay taxes");
        }}}

