package day10_NestedIf;

public class Ternary {
    public static void main(String[] args) {

        int a = 100;
        int b = 200;
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("max = " + max);

        System.out.println("----------------------------------");

        int max2 = (a > b) ? a : b;
        System.out.println("max2 = " + max2);
    }
}
