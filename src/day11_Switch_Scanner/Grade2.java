package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch = 'E';
        String result = "";

        switch (ch) {
            case 'A': case 'B': case 'C': case 'D': // you can declare the empty case block
                result = "Passed";
                System.out.println(result);
                break;
            case 'F':
                result = "Failed";
            default:
                result = "INVALID";

        }
        System.out.println(result);
    }
}

/*
if the grade is A or B or C or D =======> "Passed"
otherwise =====> "Failed"
 */