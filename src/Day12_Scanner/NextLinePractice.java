package Day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your age: ");
          int age=input.nextInt();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();
        input.nextLine();

        System.out.println("Enter your GPA:");
        double Gpa = input.nextDouble();
        input.nextLine();

        System.out.println("Enter your school name:");
        String SchoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("Gpa = " + Gpa);
        System.out.println("SchoolName = " + SchoolName);

input.close();


    }
}
