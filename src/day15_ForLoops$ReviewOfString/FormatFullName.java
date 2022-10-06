package day15_ForLoops$ReviewOfString;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        String firstName = "cyDEo";
        String lastName = "SCHOOL";
        //firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
                                         // I get C             i get "ydeo"

        firstName = (""+firstName.charAt(0) ).toUpperCase() + firstName.substring(1).toLowerCase();
        //converting to string by opening parentheses and then use .toUpperCase()method==> "C";

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        String fullName = firstName + " " + lastName;

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("fullName = " + fullName);

        //String fullName = new Scanner(System.in)


    }
}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

 */