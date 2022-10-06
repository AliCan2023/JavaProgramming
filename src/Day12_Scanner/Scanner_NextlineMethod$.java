package Day12_Scanner;

import java.util.Scanner;

public class Scanner_NextlineMethod$ {
    public static void main(String[] args) {
        // 123Enter this method reads everything that inputs even reads the Enter.

        Scanner input = new Scanner(System.in); // the Enter leaves Scanner's memory unless we use nextLine method.

        System.out.println(" Enter your full names: ");
        String fullName = input.nextLine();

        System.out.println("Enter your programming Language:");
        String programming = input.nextLine();

        System.out.println("Enter your age:");
        //int age = input.nextInt();  // 23Enter // press the Enter key but cannot read thus this stays in the class memory.
        // since the Enter leaves there you don't have chance to input next line
        //input.nextLine(); // this method is only the method that can take out left out Enter:)
        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Full Name: " + fullName);
        System.out.println("Programming language: " + programming);
        //System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
        System.out.println("age = " + age);
        input.close();


    }

}
