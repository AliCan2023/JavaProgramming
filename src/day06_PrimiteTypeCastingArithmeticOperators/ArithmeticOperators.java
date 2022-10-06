package day06_PrimiteTypeCastingArithmeticOperators;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(10 / 4);
        System.out.println(10.0 / 4);
        System.out.println(10 / 4.0);
        System.out.println(10d / 4); // adding lower or upper case "d" would result in decimal ;
        System.out.println(10 / 4D);

        /*
        In Java division format:
                                   integer / integer =====> integer
                                   decimal /integer ======>decimal
                                   integer / decimal =====>decimal
                                   decimal / decimal =====> decimal
         */
        // -----------------
        int a = 100;
        double b = a/6d; //result is 16.0
        System.out.println(b);
        // or-----------
        double c = (double)a / 6;
        System.out.println(c);

    }




}
