package day08_$09_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 50,
                weeklyHOurs = 45;

        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;

        //-------------------------
        int salaryBeforeTax = hourlyRate * weeklyHOurs * 52; // salary is equal to one week salary * 52

        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("State Tax =  $" + stateTax);
        System.out.println("Federal Tax = $" + federalTax);
        System.out.println("Total ax =  $" + totalTax);
        System.out.println("Net income  = $" + salaryAfterTax);


    }
}
/*
3. create a class
   3.1 declare the following variables ;
           hourlyRate WeeklyHours StateTaxRate federalTaxRate

   3.2
 */
