package day09_if$elseStatement;

public class PosNegZero {
    public static void main(String[] args) {


        int n = 100;
        /*
        boolean positive = n > 0;
        boolean negative = n < 0;
        boolean zero = n == 0;
        */
        if (n > 0) {
            System.out.println(n + " is a positive number. ");
        } else if (n < 0) {
            System.out.println(n + " is a negative number.");
        } else {
            System.out.println(" Zero ");
        }

    }
}



