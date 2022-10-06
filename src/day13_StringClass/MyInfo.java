package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scan.nextInt(); //33Enter

        System.out.println("Enter your gender:");
        String  gender = scan.next(); // M Enter
        scan.nextLine();// Takes the leftover two EnterEnter from previous method and clear the scanner memory that the next nextLine method enables user to input

        System.out.println("Entre your full name:");
        String fullName = scan.nextLine(); // if the previous scanner method that's used is not nextLine() then we need additional nextLine method after the other method;

        System.out.println("Enter your phone number:");
        long phone = scan.nextLong();

        System.out.println("Enter your zipcode:");
        int zipcode = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your school name name:");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName= scan.nextLine();

        System.out.println("Enter the state name:");
        String stateName = scan.nextLine();

        System.out.println("Enter your building number:");
        int buiNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your street name:");
        String strName= scan.nextLine();

        scan.close(); //make sure always do clsoe it not to consume the memory;

        System.out.println("Full Name = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phone number= " + phone);
        System.out.println("Address: \n\t\t " + buiNumber +strName + "\n\t\t " + cityName + ", " + stateName + " " + zipcode);
        System.out.println("school Name = " + schoolName);






    }
}
