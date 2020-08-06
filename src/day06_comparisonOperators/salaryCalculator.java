package day06_comparisonOperators;

public class salaryCalculator {
    public static void main(String[] args) {
        double rate = 50;
        double stateTaxRate = 0.05;
        double federalTaxRate = 0.2;
        int weeklyHour = 45;
        double salary = rate * weeklyHour * 48;
        double totalTax = salary * (stateTaxRate + federalTaxRate);
        double netSalary = salary - totalTax;
        System.out.println("Gross salary is " + salary + " USD");
        System.out.println("Total tax is " + totalTax + " USD");
        System.out.println("Net salary is " + netSalary + " USD");



    }

}
