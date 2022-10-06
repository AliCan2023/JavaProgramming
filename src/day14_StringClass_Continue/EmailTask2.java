package day14_StringClass_Continue;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();

        String emailAddress = "craig_federighi@apple.com";

        String firstName = emailAddress.substring(0, emailAddress.indexOf("_"));
        String lastName = emailAddress.substring(emailAddress.indexOf("_") + 1, emailAddress.indexOf("@"));
        String Domain = emailAddress.substring(emailAddress.indexOf("@") + 1, emailAddress.indexOf("."));

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
       // Domain = Domain.substring(0, 1).toUpperCase() + Domain.substring(1);

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Domain: " + Domain);


    }
}
/*
8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
 */