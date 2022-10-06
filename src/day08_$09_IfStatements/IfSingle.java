package day08_$09_IfStatements;

public class IfSingle {
    public static void main(String[] args) {

        int number = 301; // what if number = 303;

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = ! evenNumber; // not even number
        
        if (evenNumber) {  // even number
            System.out.println(number + "  is even Number");
        }
        // what if number is odd in this case it executes blow block;
       // boolean oddNumber = number % 2 != 0;

        if (oddNumber) {  // odd number
            System.out.println(number + " is Odd Number");

        }
        if (!evenNumber) { //not even number
            System.out.println(number + " is odd number = " + oddNumber);
        }

        System.out.println("____________________________");

        int nn = 200;
        // positive

        if (nn > 0){
            System.out.println( nn + " is positive. ");
        }
         // negative
        if (nn<0 ){
            System.out.println(nn + " is negative.");
        }

        // zero
        if(nn ==0 ){
            System.out.println(nn + " is zero. ");

        }
    }
}
