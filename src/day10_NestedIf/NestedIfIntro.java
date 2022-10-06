package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 99;

        if (score >= 0 && score <= 100) { // if score is valid.pre-condition==>Nested if;
            if (score >= 60) { // if student passed the exam.
                System.out.println("Passed");
            } else {  // if the student failed exam.
                System.out.println("Failed");
            }
        } else { // if the score is not valid
            System.out.println("Invalid Score");


            System.out.println("************************************");

            int age = 33;
            boolean hasId = true; // if this is "!true" ==> executes "else" precondition statement

            if (hasId) { // if the person has ID
                if (age >= 21) { //if the person is 21 or older
                    System.out.println("Eligible to buy alcohol.");
                } else { //if the person is younger than 21
                    System.out.println("Not eligible to buy alcohol.");
                }
            } else { // if the person does not have ID
                System.out.println("You must get an ID to buy alcohol.");
            }


        }


        System.out.println("______________________");


        int number = 3; // ( 1<= number <=7)there are 7 days a week. must create a pre-condition

        if (number >= 1 && number <= 7) { // if the number is a valid number between 1~7
            // 7 options we have Monday  to Sunday
            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else { //(n == 7)
                System.out.println("Sunday");
            }

        } else {  // if the number is not valid
            System.out.println("Invalid Number.");
        }

    }
}

