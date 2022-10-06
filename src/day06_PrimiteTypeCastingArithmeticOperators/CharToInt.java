package day06_PrimiteTypeCastingArithmeticOperators;

public class CharToInt {

    public static void main(String[] args) {

        char chz = 'a';
        int zhc = chz;
        System.out.println("zhc = " + zhc);
        System.out.println("chz = " + chz);
        System.out.println("----------------------");
        /*
        We can convert char to int in java using various ways.
        If we direct assign char variable to int, it will return ASCII value of given character.
         */
        // 1) Java char to int Example: Get ASCII value
        //Let's see the simple code to convert char to int in java.
        char c = 'a';
        char c2 = '1';
        int a = c;
        int b = c2;
        System.out.println(a);
        System.out.println(b);
        System.out.println("----------------------");
        /*
        2) Java char to int Example: Character.getNumericValue()
            Let's see the simple code to convert char to int in java using
            Character.getNumericValue(char) method which returns an integer value.
         */

        char c1 = '1';
        int a1 = Character.getNumericValue(c1);
        System.out.println(a1);
        System.out.println("----------------------");
/*
       3) Java char to int Example: String.valueOf()
          Let's see another example which returns integer value of specified char value
          using String.valueOf(char) method.
 */
        char e = '1';
        int d = Integer.parseInt(String.valueOf(e));
        System.out.println(d);

    }
}
