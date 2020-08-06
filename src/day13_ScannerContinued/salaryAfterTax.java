package day13_ScannerContinued;
import java.util.Scanner;
public class salaryAfterTax {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your salary: ");
        int salary = input.nextInt();
        System.out.println("Enter state tax rate: ");
        double stateTaxRate = input.nextDouble();
        double stateTax = salary * stateTaxRate;

        System.out.println("Enter federal tax rate: ");
        double federalTaxRate = input.nextDouble();
        double federalTax = salary * federalTaxRate;
        double salaryAfterTax = salary - stateTax - federalTax;
        System.out.println("Your annual salary is $ "+ salary);
        System.out.println("Your state tax: $" + stateTax);
        System.out.println("Your federal tax is: $"+ federalTax);
        System.out.println("Your salary afer tax is: $"+ salaryAfterTax);




    }
}
