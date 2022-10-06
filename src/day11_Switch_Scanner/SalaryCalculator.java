package day11_Switch_Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 75_000;
        boolean isMarried = false; // if it is true then the salaryAfterTax is $63750.0
        double taxRate; // or double taxRate= 0.0; gives the temporary value;

        if (salary >= 130_000) {  //false: salary < 130_000
            taxRate = 0.35;
        } else if (salary >= 100_000) {  // false if the salary  < 100_000
            taxRate = 0.30;
        } else if (salary >= 80_000) {  // false if the salary  < 80_000
            taxRate = 0.25;
        } else {
            taxRate = 0.20;
        }

        if (isMarried) {
            taxRate -= 0.05;
        }

        double salaryAfterTax = salary - (salary * taxRate);
        System.out.println("Salary After Tax = $" + salaryAfterTax);

    }
}
/*Task: Write a program that can calculate the salary after tax based on the following requirements
                    the tax rates are:
                    35% for salary of 130K or more
                    30% for salary of 100K to 130k (excluded)
                    25% for salary of 80k to 100k   (excluded)
                    20% for salary less than 80k
              in addition if the person is married, he/she will pay 5% less tax
 */