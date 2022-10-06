package Day12_Scanner;

import java.util.Scanner;

public class ScannerPractice_2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
         // System.out.println("Enter true or false.");
        // boolean result = input.nextBoolean();

        System.out.println("Enter your name:");
        String name = input.next(); // Expecting to get ONLY one word;this method only reads input until the SPACE.
        System.out.println("name = " + name);
        input.close();  // make habit to close the Scanner...



    }
}
