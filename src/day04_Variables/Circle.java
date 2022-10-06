package day04_Variables;

public class Circle {
    public static void main(String[] args) {

        // Pi, radius, diameter, area, primeter;

        double radius = 5.5;

        double Pi = 3.14;
        double diameter = radius * 2; //  3.9 *2
        double area = radius * radius * Pi; // 3.9 *3.9 *Pi
        double primeter = diameter * Pi; //  3.9 *2 *3.14

        System.out.println("Radius=" + radius);
        System.out.println("Diameter=" + diameter);
        System.out.println("Area=" + area);
        System.err.println("Primeter=" + primeter);

    }
}