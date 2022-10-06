package Day12_Scanner;

//import java.util.*;  // wild import : imports everything from the package.

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enet a number between 1 to 7:");

        byte num = (byte) scan.nextInt(); // int num = scan.nextInt();

        String NameOfDay ="";

        if (num >= 1 && num <= 7) {
            NameOfDay=(num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ?"Wednesday"
                    : (num == 4) ? "Thursday" : (num==5) ?"Friday" :(num==6)?"Saturday" : "Sunday";
        } else {
            NameOfDay = "Invalid Number...";
        }
        System.out.println("Name Of the Day is " + NameOfDay);
        //scan.close();  // it is odd that in this task even I don't put the close method my scanner shuts down,,,why????3


    }
}
