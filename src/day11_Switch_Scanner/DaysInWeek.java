package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 6;
        /*
        if(number ==1) {
         */
        switch (number) { // 1,2,3,4,5,6,7seven possibilities to compare to the given value;
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break; // exit the switch after executing the cas block
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Out of Range!");
                break;// we don't need to give the "break" statement for the last block;


        }


    }
}
