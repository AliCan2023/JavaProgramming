package day08_$09_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steven ";
        int age = 19;
        String citizen = "Turkiye";

        // to check the condition we use AND logic &&;
        boolean isEligibleVote = age >= 18 && citizen == "USA";
        //                   19 >= 18 &&  "Turkiye" == "USA"
        //                   true &   false

        System.out.println(name + "is eligible to vote = " + isEligibleVote);

        System.out.println("************************************");

        String name1 = "Jashua";

        int creditScore = 720;
        int age1 = 33;
        int income = 5000;
        boolean isEligible1 = creditScore >= 700 && age1 >= 21 && income >= 60000;

        System.out.println(name1 + " is eligible for loan = " + isEligible1);

        System.out.println("******************************");
        // logical || or operator

        String name2 = "Shasa";
        int age2 = 21;
        char gender = 'F';

        boolean isEligible2 = age2 >= 18 && (gender == 'M' || gender == 'F');

        System.out.println(name2 + " is eligible to register for selective service  = " + isEligible2);
        System.out.println("______________________");

        String name3 = "Ali";
        String countryOfBirth = "Turkiye";
        boolean marriedToUSCitizen = false;
        boolean isEligible3 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        // false --Turkiye   ||     false ----single;
        System.out.println(name3 + " is eligible to apply for USA citizenship  = " + isEligible3);
        System.out.println("_________________________");

        String StudentName = " Berna";

        double GPA = 2.5;
        int familyIncome = 50000;
        boolean isEligible4 = GPA >= 3.5 || familyIncome <= 60000;
        //    false    ||    true
        System.out.println(StudentName + " is eligible for scholarship  = " + isEligible4);

        System.out.println("*********************");

        // ! Not true operator
        boolean result = true;
        System.out.println("result = " + result);

        boolean result1 = !result; // ! is  not true / opposite operator ;

        System.out.println("result1 = " + result1);

        System.out.println("_______________________");


        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


    }
}
