package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

        // char vs ascii table;

        char chr = '$';
        char ascii = 35000;
        char chz = 'a'; // char stores only a character or a symbol;


        // booleans tru or false ;

        boolean isMarried = true;
        boolean hasChild = false;

        System.out.println("chr = " + chr);
        System.out.println("ascii = " + ascii);
        System.out.println("hasChild = " + hasChild);
        System.out.println("isMarried = " + isMarried);


        String name = "Alican";
        String city = "Ankara";
        String state = "Virginia";
        String country = "USA";

        System.out.println("name = " + name);
        System.out.println("\t");  // horizontal tab
        System.out.println("city = " + city);
        System.out.println("\\\\"); // two back slashes
        System.out.println("state = " + state);
        System.out.println("\"Game of Thrones\"");  // cause a double mark to be printed
        System.out.println("country = " + country);
        System.out.println("\n");
        System.err.println("the End");

        String First_Name$= "Ali";
        char  altTre= 95;
        System.err.println("altTre = " + altTre);
        System.err.println("First_Name$ = " + First_Name$);


    }
}
