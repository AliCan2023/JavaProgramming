package day10_NestedIf;

public class NameOfMonth {
    public static void main(String[] args) {

        int number = 10;     // precondition the number must be 1~12
        String result = " "; // local variables should be initialized before we use it that's why gives temporary values

        if (number >= 1 && number <= 12) {  // if the number is valid

            if (number == 1) {
                result = "January";
            } else if (number == 2) {
                result = "February";
            } else if (number == 3) {
                result = "March";
            } else if (number == 4) {
                result = "April";
            } else if (number == 5) {
                result = "May";
            } else if (number == 6) {
                result = "June";
            } else if (number == 7) {
                result = "july";
            } else if (number == 8) {
                result = "August";
            } else if (number == 9) {
                result = "September";
            } else if (number == 10) {
                result = "October";
            } else if (number == 11) {
                result = "November";
            } else {
                result = "December";
            }

        } else { // if the number is not valid
            result = "INVALID";
        }
        System.out.println(result); // local variables should be initialized before we use it that's why gives temporary values


    }
}
