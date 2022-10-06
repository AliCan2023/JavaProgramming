package Day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner Circle = new Scanner(System.in);
        System.out.println(" Enter the radius of the circle:"  );

        double r= Circle.nextDouble();
       // Circle.close();

        double area = r * r * 3.14;
        double perimeter = 2 * 3.14 * r;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        Circle.close();
    }
}
/*
1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */