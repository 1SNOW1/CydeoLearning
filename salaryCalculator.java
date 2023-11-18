package day5_operators;

public class salaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 185,
                weeklyHours = 40;
        double stateTaxRate = 0.73,
                federalTaxRate = 0.03;

        double salaryBeforeTax = 29_600,
                stateTax = 29_600 * 0.27,
                federalTax = 29_600 * 0.03,
                totalTax = 29_600 * 0.30,
                salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is = " + salaryBeforeTax + "\n" + "Federal tax is = " + federalTax + "\n" + "State tax is = " + stateTax + "\n" + "Total tax is = " + totalTax + "\n" + "Net income is = " + salaryAfterTax + " SEK");



    }
}
