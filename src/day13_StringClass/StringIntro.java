package day13_StringClass;

public class StringIntro {
    public static void main(String[] args) {
        String name = "Silver Spoon";
        String name1 = "Silver Spoon";
        String name2 = "Silver Spoon";
        String name3 = "Silver Spoon";
        /*
         In these String literals only one object created in Java Heap.NO Duplication.
         and then  returns to the Variables. that's why we could get the same literal in response to the variables.
         */
        System.out.println(name == name3); //Apparently true;
        System.out.println(name1 == name3); // This is also true;
        System.out.println("_________________________________________");

        String str = new String("Wooden Spoon");
        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon"); // They aare all different Objects;

        System.out.println(str == str3); //false
        System.out.println(str2 == str3); // false
        System.out.println(str == str2); // false

        System.out.println("______________________");

        String s1 = "Java";
        String s2 = new String ("Java");

        System.out.println(s1.equals(s2)); // true; Comparing two Strings/Objects we sue this printout statement;


        String s3 = "Java";
        String s4 = new String("java");

        System.out.println(s3.equals(s4)); // false


    }

}
