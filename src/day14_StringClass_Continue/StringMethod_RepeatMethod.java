package day14_StringClass_Continue;

import java.sql.SQLOutput;

public class StringMethod_RepeatMethod {

    public static void main(String[] args) {

        String Symbol = "Cydeo";

       String str =Symbol.repeat(4); // expected to get "Cydeo Cydeo Cydeo Cydeo";
        System.out.println(Symbol);

        String Symbol1 = "When will you become rich? ";
        String str1 = Symbol1.repeat(99);
        System.out.println(str1);

        System.out.println("________________________________");

        System.out.println("Friday \n".repeat(15)); // Directly can be used in the printout statement;


        System.out.println("Will you marry me?\t".repeat(33));
        System.out.println("I am not gay ".repeat(33));



    }
}
