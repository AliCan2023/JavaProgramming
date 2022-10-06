package day06_PrimiteTypeCastingArithmeticOperators;

public class PremitiveCasting {
    public static void main(String[] args) {
        // implicit casting; smaller primitive type is assigned  by compiler automatically to the longer type eg;

        byte a = 100;
        short b = a;
        // short b = (short)a; (short) displays gray it means it's done by the compiler;

        // explicit casting:  larger primitive type CANNOT be directly assigned to smaller type;

        double  c = 5.5;
        short d = (short) c;

        System.err.println("short d = " + d);


    }
}
