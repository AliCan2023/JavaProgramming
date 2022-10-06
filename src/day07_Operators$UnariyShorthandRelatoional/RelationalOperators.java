package day07_Operators$UnariyShorthandRelatoional;

public class RelationalOperators {
    public static void main(String[] args) {

        // >, >= , <, <=

        boolean Result = 20 > 40;
        System.out.println("Result = " + Result); //false

        boolean Result1 = 200 >= 150;
        System.out.println("Result1 = " + Result1); // true

        // if credit score is of 720
        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720; // if the credit score is 720 or greater, then it's eligible;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result5 = 100 < 120; // true
        System.out.println("result5 = " + result5);

        int examScore = 59;

        boolean isFailed = examScore <= 59; // true . at least one condition met;
        System.out.println("isFailed = " + isFailed);

        System.out.println("****************************");

        // Equal Operator: ==

        int x = 300;
        int y = 400;
        boolean equal = x == y;
        System.out.println("equal = " + equal); // false. 100 never equal to 200;

        boolean Str = "Ali Can" == "walle Can";
        System.out.println("Str = " + Str); //false.  never same ;

        boolean chr = 'B' == 'b';
        System.out.println("chr = " + chr); // false . Java is case sensitive language;

        // even the space counts charachter so...

        boolean Jv = "Java   " == "Java  "; // false  . the given  'space' is not the same .
        System.out.println("Jv = " + Jv);
        System.out.println("*************************");

        // Not equal operator: !=

        boolean NotEqual = 200 != 300;
        System.out.println("NotEqual = " + NotEqual); // of course it is true.

        boolean StrNotEqual = "Java " != "Java  ";
        System.out.println("StrNotEqual = " + StrNotEqual); // true . space matters.

        boolean StrNoEqual = "Ali Can " != "Ali Can ";
        System.out.println("StrNoEqual = " + StrNoEqual);  // false. these two str are the same.


    }
}
