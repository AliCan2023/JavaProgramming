package day13_StringClass;

import java.util.Scanner;

public class StringInitials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next(); //"Java
        scan.nextLine();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);//x  all the index number is integer.
        char l = lastName.charAt(0);

        String initial = f + "."+ l; // as long as the double quotes involved it is Concatenation;

        System.out.println("initial = " + initial);



    }
}
