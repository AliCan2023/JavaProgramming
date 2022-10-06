package day14_StringClass_Continue;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();

        String Email = " mike_tyson@gmail.com";

        String firstName = Email.substring(0, Email.indexOf("_"));
        String lastName = Email.substring(Email.indexOf("_")+1, Email.indexOf("@"));
        String domainName = Email.substring(Email.indexOf("@"));

        Email = lastName + "_" + firstName + domainName;

        System.out.println("Email = " + Email);

    }
}
/*
7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */