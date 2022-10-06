package day11_Switch_Scanner;

public class NumOfDaysLeapYearSimpleFun {
    public static void main(String[] args) {

    int year = 2004;
    int number = 3;
    String Result ="";

        if (number >= 1 && number <= 12) { // if the condition is true number is from 1 to 12

        switch (number) {
            case 2:
                //if(year%4 ==0) {
                Result = (year % 4 == 0) ? "THere are 29 days in this month." : "There are 28 days in this month.";
                //}else{
                // Result = "There are 28 days in this month.";
                // }
                break;

            case 4: case 6: case 9: case 11:
                Result = "There are 30 days in this month.";
                break;

            default:  //1, 3, 5, 7, 8, 10,12 these are 31 days-month
                Result = "There are 31 days in this month.";
        }

    } else {
        Result = "INVALID number";
    }

        System.out.println(Result);
}
}

  /*  4. NumOfDaysLeapYear  //  need to create 1 default block 5 case blocks:(months for 2, 4, 6, 9, 11)

        28 Days: 2
        30 days: 4, 6, 9, 11
        31 days: 1, 3, 5, 7, 8, 10, 12

        If(1~12){


        }else{
            Invalid
        */
