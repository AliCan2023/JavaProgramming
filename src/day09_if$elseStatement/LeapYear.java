package day09_if$elseStatement;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2022;

        boolean leapYear = year % 4 == 0;

        if (leapYear) {
            System.out.println("year " + year + " is a leap year.");
        }
        if (!leapYear) {
            System.out.println("year " + year + " is NOT a leap year.");
        }

        System.out.println("________________________");

        if(leapYear) {
            System.out.println(" year " + year + " is a leap year.");
        }else {
            System.out.println(" year " + year + " is NOT a leap year.");
        }

    }
}
