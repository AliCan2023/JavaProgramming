package day07_Operators$UnariyShorthandRelatoional;

public class ArthmeticOpRemainder {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 15;
        int division = num1 / num2; // division variable contains the result of num1 divided by num2;
        int remainder = num1 % num2; // remainder it contains the remainder of num1 divided by numbers

        // 10 divide by 3 is eqaul to 3 with a reminder of 1;
        System.out.println(num1 + " divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder);
        System.out.println("-------------*********---------------");
        System.out.println("The remainder of 10 / 3 is  = " + remainder);
        System.out.println("division = " + division);
    }
}
