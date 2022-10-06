package day06_PrimiteTypeCastingArithmeticOperators;

public class Birthday {
    public static void main(String[] args) {

        String name = "Ali John";
        int birthDay = 23;
        String birthMonth = "June";
        int birthYear = 1990;
        char slash = 47; // take ascii as a reference.


        // John was born on month/day/year/
        System.out.println(name + " was born on " + birthMonth + slash + birthDay + slash+ birthYear + ".");
        System.out.println("---------------------");

        String bookName = "The Rich Dad and the Poor Dad";
        System.out.println("My favorite book is "+ "\"" + bookName + "\"");
                           // or "My favorite book is \"" + bookName + "\"".
        /*
        Remember the escape sequences: \n --new line;
                                       \t--- horizontal Tab;
                                       \" ----is a double quote;
                                       \\ -----a backslash;

         */
    }
}
/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person
			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
 */