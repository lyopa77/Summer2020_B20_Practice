package day03_sequences_Variables;

public class salaryCalculator {
    public static void main(String[] args) {
      //totalTax = salary x tax rate
      //salaryAfterTax = salary - totalTax
        //$100,000  28%
        double salary = 150000;
        double tax = 0.28;
        double TotalTax = salary*tax;
        double SalaryAfterTax = salary-TotalTax;

        System.out.println(SalaryAfterTax);

    }


}
