package day08_$09_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = " ALi ";
        int age = 37;
        String citizen = "USA";

        boolean isEligible = age >= 22 && citizen == "USA";

        // Eligible
        if (isEligible) {
            System.out.println( "Eligible ");
        }

        // Not Eligible

        if (!isEligible) {  // !true ==> not true
            System.out.println("Not Eligible.");
        }


    }
}
